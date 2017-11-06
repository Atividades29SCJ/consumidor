package br.com.fiap.consumidor.client;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Produtos")
@XmlAccessorType(XmlAccessType.FIELD)
public class Produtos {

	@XmlElement(name = "produto")
	private List<Long> codPRodutos;

	public List<Long> getCodPRodutos() {
		return codPRodutos;
	}

	public void setCodPRodutos(List<Long> codPRodutos) {
		this.codPRodutos = codPRodutos;
	}

}
