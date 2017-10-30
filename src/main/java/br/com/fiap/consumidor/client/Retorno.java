package br.com.fiap.consumidor.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "retorno")
@XmlAccessorType(XmlAccessType.FIELD)
public class Retorno {

	private String mensagem; 
	
	public Retorno(){
		
	}

	public Retorno(String mensagem) {
		super();
		this.setMensagem(mensagem);
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
	
}
