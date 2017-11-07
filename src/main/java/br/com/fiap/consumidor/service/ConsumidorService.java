package br.com.fiap.consumidor.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.security.sasl.AuthenticationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;

import br.com.fiap.consumidor.client.Produto;
import br.com.fiap.consumidor.client.Produtos;
import br.com.fiap.consumidor.service.vo.SimularCompraVO;
import br.com.fiap.consumidor.service.vo.UsuarioVO;
import br.com.fiap.financeira.servico.CadastrarClienteRequest;
import br.com.fiap.financeira.servico.CadastrarClienteResponse;
import br.com.fiap.financeira.servico.CadastroClienteRequestPojo;
import br.com.fiap.financeira.servico.FinanceiroWebService;
import br.com.fiap.financeira.servico.FinanceiroWebServiceService;
import br.com.fiap.loja.service.CompraVO;
import br.com.fiap.loja.service.Retorno;

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

			if (StringUtils.isBlank(nome) || StringUtils.isBlank(cpfcnpj) || valor == null) {
				throw new Exception("Parametros inválidos");
			}

			usuarioVO.setNome(nome);
			usuarioVO.setCpnjcpf(cpfcnpj);
			usuarioVO.setValor(valor);

			FinanceiroWebService port = new FinanceiroWebServiceService().getFinanceiroWebServicePort();
			CadastrarClienteRequest clienteRequest = new CadastrarClienteRequest();

			CadastroClienteRequestPojo cliPojo = new CadastroClienteRequestPojo();
			cliPojo.setCpfCnpj(cpfcnpj);
			cliPojo.setNome(nome);

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
	public boolean autenticado(String usuario, String senha) throws AuthenticationException {

		if (StringUtils.isBlank(usuario) || StringUtils.isBlank(senha)) {
			throw new AuthenticationException("Usuario ou senha não informado");
		}

		if (usuario.equals("fiap") && senha.equals("123")) {
			return true;
		} else {
			throw new AuthenticationException("Usuario ou senha invalido");
		}

	}

	@WebMethod
	public Produto[] listarProdutos(@WebParam(name = "Username", header = true) String usuario,
			@WebParam(name = "Password", header = true) String senha) throws AuthenticationException {
		
		autenticado(usuario, senha);
		
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
			if (cods.size() - 1 == i) {
				sb.append(" { \"codigo\" : " + cods.get(i) + "} ");
			} else {
				sb.append(" { \"codigo\" : " + cods.get(i) + "}, ");
			}

		}

		sb.append("]");

		return sb.toString();
	}

	private String montaJsonEfetuarCompra(List<Long> cods) {
		StringBuffer sb = new StringBuffer();

		sb.append("{ ");

		sb.append("\"documento\" : 123, ");
		sb.append("\"listaProdutos\": ");
		sb.append(montaJson(cods));
		sb.append(" }");

		return sb.toString();
	}

	private void validaLista(List<Long> listaValidacao) throws Exception {

		List<Produto> produtos = Arrays.asList(obterListaProdutos());

		List<Long> codsList = new ArrayList<>();

		for (Produto p : produtos) {

			codsList.add(p.getCodigo());

		}

		for (int i = 0; i < listaValidacao.size(); i++) {

			if (!codsList.contains(listaValidacao.get(i))) {
				throw new Exception("O código de produto: " + listaValidacao.get(i) + " não é válido");
			}
		}

	}

	public SimularCompraVO simularCompra(@WebParam(name = "documento", header = false) String cpfcnpj,
			@WebParam(name = "produtos", header = false) Produtos codProdutos,
			@WebParam(name = "Username", header = true) String usuario,
			@WebParam(name = "Password", header = true) String senha) throws Exception {

		if (autenticado(usuario, senha)) {
			SimularCompraVO simularCompraVo = new SimularCompraVO();

			if (StringUtils.isBlank(cpfcnpj) || codProdutos == null || codProdutos.getCodPRodutos() == null
					|| codProdutos.getCodPRodutos().isEmpty()) {
				throw new Exception("Parametros inválidos");
			}

			validaLista(codProdutos.getCodPRodutos());

			String json = montaJson(codProdutos.getCodPRodutos());

			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target("http://loja-29scj.us-east-2.elasticbeanstalk.com/simularCompra");

			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);

			Response response = invocationBuilder.post(Entity.json(json));

			// valorImpostos=10.0, valorFrete=10.0, valorProdutos=600.0,
			// valorTotal=620.0

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

	@WebMethod
	public boolean efetuarCompra(@WebParam(name = "dadosCompra", header = false) CompraVO dadosCompra,
			@WebParam(name = "Username", header = true) String usuario,
			@WebParam(name = "Password", header = true) String senha) throws Exception {

		if (autenticado(usuario, senha)) {
			
			if(dadosCompra == null || StringUtils.isBlank(dadosCompra.getDocumento()) 
					|| dadosCompra.getListaProdutos() == null || dadosCompra.getListaProdutos().isEmpty()){
				throw new Exception("Parametros inv�lidos");
			}
			
			Client client = ClientBuilder.newClient();
			WebTarget webTarget = client.target("http://loja-29scj.us-east-2.elasticbeanstalk.com/efetuarCompra");
			Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);

			Response response = invocationBuilder.post(Entity.entity(dadosCompra, MediaType.APPLICATION_JSON));

			if(response.getStatus() != 200){
				throw new Exception("Erro interno na chamada do servi�o da loja, Tente novamente mais tarde!");
			}
			
			Retorno retorno = response.readEntity(br.com.fiap.loja.service.Retorno.class);
			
			return retorno.isRetorno();

		}

		return false;
	}

	@WebMethod
	public List<UsuarioVO> listarUsuarios(@WebParam(name = "Username", header = true) String usuario,
			@WebParam(name = "Password", header = true) String senha) throws AuthenticationException{
		
		autenticado(usuario, senha);
		
		return usuarios;
	}
	
}
