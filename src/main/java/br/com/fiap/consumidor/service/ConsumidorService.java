package br.com.fiap.consumidor.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.fiap.consumidor.service.vo.UsuarioVO;


@WebService(endpointInterface = "br.com.fiap.consumidor.service.ConsumidorService", serviceName = "ConsumidorService")
public class ConsumidorService {
	
	
	@WebMethod
	public String criarUsuario(String nome, String cpfcnpj, Double valor){
		
		UsuarioVO usuarioVO = new UsuarioVO();
		usuarioVO.setNome(nome);
		usuarioVO.setCpnjcpf(cpfcnpj);
		usuarioVO.setValor(valor);
		
		return "Usuario cadastrado com sucesso";
		
	}
	
	
}
