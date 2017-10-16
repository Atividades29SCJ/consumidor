package br.com.fiap.consumidor.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.fiap.consumidor.service.vo.UsuarioVO;


@WebService(endpointInterface = "br.com.fiap.consumidor.service.ConsumidorService", serviceName = "ConsumidorService")
public class ConsumidorService {
	
	
	@WebMethod
	public String criarUsuario(@WebParam(name="nome", header=false)String nome,
								@WebParam(name="documento", header=false) String cpfcnpj,
								@WebParam(name="valor", header=false) Double valor){
		
		UsuarioVO usuarioVO = new UsuarioVO();
		usuarioVO.setNome(nome);
		usuarioVO.setCpnjcpf(cpfcnpj);
		usuarioVO.setValor(valor);
		
		return "Usuario cadastrado com sucesso";
		
	}
	
	
}
