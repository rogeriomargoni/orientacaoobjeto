package com.target.treinamento.orientacaoobjeto.dominio;

public class Empregado {

	private String 	nome;
	private String 	cargo;
	private Double 	salario;
	
	// pegar
	public String getNome(){
		return this.nome;
	}
	
	//setar
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getCargo(){
		return this.cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Double getSalario(){
		return this.salario;
	}
	
	
	public void setSalario(Double salario) {
		
		if (this.cargo.equals("Gerente")) {
			this.salario = salario * 1.1;
		} else {
			this.salario = salario;
		}
	}	
}
