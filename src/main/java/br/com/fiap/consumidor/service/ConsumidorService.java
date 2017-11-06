package br.com.fiap.consumidor.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;

import br.com.fiap.consumidor.client.Produto;
import br.com.fiap.consumidor.service.vo.SimularCompraVO;
import br.com.fiap.consumidor.service.vo.UsuarioVO;
import br.com.fiap.financeira.servico.CadastrarClienteRequest;
import br.com.fiap.financeira.servico.CadastrarClienteResponse;
import br.com.fiap.financeira.servico.CadastroClienteRequestPojo;
import br.com.fiap.financeira.servico.FinanceiroWebService;
import br.com.fiap.financeira.servico.FinanceiroWebServiceServiceLocator;

@WebService(endpointInterface = "br.com.fiap.consumidor.service.ConsumidorService", serviceName = "ConsumidorService")
public class ConsumidorService {

	public static List<UsuarioVO> usuarios = new ArrayList<UsuarioVO>();
	
	@WebMethod
	public String CadastrarConsumidor(@WebParam(name = "nome", header = false) String nome,
			@WebParam(name = "documento", header = false) String cpfcnpj,
			@WebParam(name = "valor", header = false) Double valor,
			@WebParam(name = "Username", header = true) String usuario,
			@WebParam(name = "Password", header = true) String senha) throws Exception {

		if (autenticado(usuario, senha)) {
			UsuarioVO usuarioVO = new UsuarioVO();
			
			if(StringUtils.isBlank(nome)|| StringUtils.isBlank(cpfcnpj) || valor == null) {
				throw new Exception("Parametros inválidos");
			}
			
			usuarioVO.setNome(nome);
			usuarioVO.setCpnjcpf(cpfcnpj);
			usuarioVO.setValor(valor);
			
			FinanceiroWebService port = new FinanceiroWebServiceServiceLocator().getFinanceiroWebServicePort();
			
			CadastrarClienteRequest clienteRequest = new CadastrarClienteRequest();
			
			CadastroClienteRequestPojo cliPojo = new CadastroClienteRequestPojo(cpfcnpj, nome);
			
			clienteRequest.setCliente(cliPojo);
			
			CadastrarClienteResponse cliResponse = port.cadastrarCliente(clienteRequest);
			
			usuarioVO.setLogin(cliResponse.getUsuario().getUsuario());
			usuarioVO.setSenha(cliResponse.getUsuario().getSenha());
			
			usuarios.add(usuarioVO);
						
			return "Usuario cadastrado com sucesso";

		} else
			throw new Exception("Falha de Autenticação");

	}

	@WebMethod(exclude = true)
	public boolean autenticado(String usuario, String senha) {

		if (StringUtils.isBlank(usuario) || StringUtils.isBlank(senha)) {
			return false;
		}

		if (usuario.equals("fiap") && senha.equals("123")) {
			return true;
		} else {
			return false;
		}

	}
	
	
	@WebMethod
	public Produto[] listarProdutos(){
		return this.obterListaProdutos();
	}
	
	
	@WebMethod(exclude = true)
	public Produto[] obterListaProdutos() {
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://loja-29scj.us-east-2.elasticbeanstalk.com/listarProdutos");

		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);

		Response response = invocationBuilder.get();

		return response.readEntity(Produto[].class);

	}

	private String montaJson(List<Long> cods) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		for (int i = 0; i < cods.size(); i++) {
			if(cods.size() -1 == i) {
				sb.append(" { \"codigo\" : "+ cods.get(i) + "} ");
			}else {
				sb.append(" { \"codigo\" : "+ cods.get(i) + "}, ");
			}
			
		}
		
		sb.append("]");
		
		return sb.toString();
	}
	
	public SimularCompraVO simularCompra(@WebParam(name = "documento", header = false) String cpfcnpj,
			@WebParam(name = "produtos", header = false) List<Long> codProdutos,
			@WebParam(name = "Username", header = true) String usuario,
			@WebParam(name = "Password", header = true) String senha) throws Exception {
		
		if (autenticado(usuario, senha)) {
			SimularCompraVO simularCompraVo = new SimularCompraVO();
			
			if(StringUtils.isBlank(cpfcnpj) || codProdutos == null || codProdutos.isEmpty()) {
				throw new Exception("Parametros inválidos");
			}
			
			List<Produto> produtos = Arrays.asList(obterListaProdutos());
			
			List<Long> codsList = produtos.stream().map(Produto::getCodigo).collect(Collectors.toList());
			
			for (int i = 0; i < codProdutos.size(); i++) {
				
				if(!codsList.contains(codProdutos.get(i))) {
					throw new Exception("O código de produto: " + codProdutos.get(i) + " não é válido");
				}
			}
			
			String json = montaJson(codProdutos);
			
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target("http://loja-29scj.us-east-2.elasticbeanstalk.com/simularCompra");

			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);

			Response response = invocationBuilder.post(Entity.json(json));
			
			//valorImpostos=10.0, valorFrete=10.0, valorProdutos=600.0, valorTotal=620.0
			
			HashMap<String, Double> responseMap = response.readEntity(HashMap.class);
			
			simularCompraVo.setValorImpostos(responseMap.get("valorImpostos"));
			simularCompraVo.setValorFrete(responseMap.get("valorFrete"));
			simularCompraVo.setValorProdutos(responseMap.get("valorProdutos"));
			simularCompraVo.setValorTotal(responseMap.get("valorTotal"));
			
			return simularCompraVo;

		} else {
			throw new Exception("Falha de Autenticação");
		}
		
	}
	
}
