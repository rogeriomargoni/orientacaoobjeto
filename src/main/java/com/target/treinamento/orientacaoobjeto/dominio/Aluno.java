package com.target.treinamento.orientacaoobjeto.dominio;

public class Aluno extends Pessoa {
	private String cpf;
	private String rg;
	private String nome;
	private String matricula;
	
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

	

	public String getMatricula(){
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
