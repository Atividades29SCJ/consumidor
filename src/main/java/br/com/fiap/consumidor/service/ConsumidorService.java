package br.com.fiap.consumidor.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fiap.consumidor.client.Produto;
import br.com.fiap.consumidor.client.Produtos;
import br.com.fiap.consumidor.service.vo.UsuarioVO;

@WebService(endpointInterface = "br.com.fiap.consumidor.service.ConsumidorService", serviceName = "ConsumidorService")
public class ConsumidorService {
	@Resource
	WebServiceContext wsCtx;

	@WebMethod
	public String criarUsuario(@WebParam(name = "nome", header = false) String nome,
			@WebParam(name = "documento", header = false) String cpfcnpj,
			@WebParam(name = "valor", header = false) Double valor,
			@WebParam(name = "Username", header = true) String usuario,
			@WebParam(name = "Password", header = true) String senha) throws Exception {

		if (autenticado(usuario, senha)) {
			UsuarioVO usuarioVO = new UsuarioVO();
			usuarioVO.setNome(nome);
			usuarioVO.setCpnjcpf(cpfcnpj);
			usuarioVO.setValor(valor);

			return "Usuario cadastrado com sucesso";

		} else
			throw new Exception("Falha de Autenticação");

	}

	@WebMethod(exclude = true)
	public boolean autenticado(String usuario, String senha) {
		MessageContext mctx = wsCtx.getMessageContext();

		Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
		List usuarios = (List) http_headers.get("Username");
		List senhas = (List) http_headers.get("Password");

		if (usuarios != null)
			usuario = usuarios.get(0).toString();
		if (senhas != null)
			senha = senhas.get(0).toString();

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

}
