package com.target.treinamento.orientacaoobjeto.dominio;

public class Professor {
	private String nome;
	private String rg;
	private String cpf;
	private Integer capacidade;
	
	// pegar
	public String getCpf(){
		return this.cpf;
	}
	
	//setar
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	public String getRg(){
		return this.rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	

	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
