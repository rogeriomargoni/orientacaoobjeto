package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Pessoa {
	private String nome;
	private String rg;
	
	
	public Pessoa(String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
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
