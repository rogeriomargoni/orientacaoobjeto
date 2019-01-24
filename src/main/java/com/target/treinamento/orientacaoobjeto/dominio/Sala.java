package com.target.treinamento.orientacaoobjeto.dominio;

public class Sala {
	private String tipo;
	private String localizacao;
	private String capacidade;
	
	
	// pegar
	public String getTipo(){
		return this.tipo;
	}
		
	//setar
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	public String getLocalizacao(){
		return this.localizacao;
	}
		
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
	
	public String getCapacidade(){
		return this.capacidade;
	}
			
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

}
