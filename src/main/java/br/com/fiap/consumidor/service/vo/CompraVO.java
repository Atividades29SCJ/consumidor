package br.com.fiap.consumidor.service.vo;

import java.util.List;

public class CompraVO {
	private String documento; 
	private List<ProdutoVO> listaProdutos;
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public List<ProdutoVO> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<ProdutoVO> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
}
