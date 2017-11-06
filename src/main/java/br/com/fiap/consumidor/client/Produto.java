package br.com.fiap.consumidor.client;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Produto {

	private Long codigo;
	private String descricao;
	private Long qtdEstoque;
	private Double valor;

	public Produto() {

	}

	public Produto(Long codigo, String descricao, Long qtdEstoque, Double valor) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtdEstoque = qtdEstoque;
		this.valor = valor;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Long qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
