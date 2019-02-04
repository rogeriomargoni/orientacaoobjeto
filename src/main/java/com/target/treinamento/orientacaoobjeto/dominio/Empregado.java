package com.target.treinamento.orientacaoobjeto.dominio;

public class Empregado {

	private String 	nome;
	private String 	cargo;
	private Double 	salario;
	
	public Empregado(String nome, String cargo, Double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.setSalario(salario);
	}	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}





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
