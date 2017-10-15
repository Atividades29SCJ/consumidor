package br.com.fiap.consumidor.service.vo;

public class UsuarioVO {
	private String nome; 
	private String login;
	private String senha;
	private Double valor;
	private String cpnjcpf;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getCpnjcpf() {
		return cpnjcpf;
	}
	public void setCpnjcpf(String cpnjcpf) {
		this.cpnjcpf = cpnjcpf;
	}
	
}
