package com.target.treinamento.orientacaoobjeto.generics;

public class Produto {
	
	// código é um atributo generico (generics)  foi criada a classe Codigo.java
	private Codigo codigo;
	private String  nomeP;
	private Integer quantidadeP;
	
	
	
	public Produto(String nomeP, Integer quantidadeP) {
		super();
		this.nomeP = nomeP;
		this.quantidadeP = quantidadeP;
	}
	
	
	public Produto(Codigo codigo, String nomeP, Integer quantidadeP) {
		super();
		this.codigo = codigo;
		this.nomeP = nomeP;
		this.quantidadeP = quantidadeP;
	}
	
	
	@Override
	public String toString() {
		return "Codigo = " + codigo + " , nomeP= " + nomeP + " , quantidadeP= " + quantidadeP;
	}


	public Codigo getCodigo() {
		return codigo;
	}
	public void setCodigo(Codigo codigo) {
		this.codigo = codigo;
	}
	
	
	public String getNomeP() {
		return nomeP;
	}
	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}
	
	
	public Integer getQuantidadeP() {
		return quantidadeP;
	}
	public void setQuantidadeP(Integer quantidadeP) {
		this.quantidadeP = quantidadeP;
	}
}
