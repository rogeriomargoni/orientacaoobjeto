package com.target.treinamento.orientacaoobjeto.dominio;

public class Pessoa {
	private String nome;
	private String cpf;
	private String rg;
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
