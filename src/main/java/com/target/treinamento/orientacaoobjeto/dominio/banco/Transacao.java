package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Transacao {
	private String bandeira;
	private Integer operacao;
	private Double valor;
	private String nome;
	
	
	
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	
	public Integer getOperacao() {
		return operacao;
	}
	public void setOperacao(Integer operacao) {
		this.operacao = operacao;
	}
	
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Transacao [bandeira=" + bandeira + ", operacao=" + operacao + ", valor=" + valor + ", nome=" + nome
				+ "]";
	}
	
	
	
}
