package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Conta {
	private Pessoa  pessoa;
	private Integer numero;
	private Double  saldo;
	
	
	public Conta(Integer numero, Double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	
	public Pessoa getPessoa() {
		return this.pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	

	@Override
	public String toString() {

		return "O cliente " + this.pessoa.getNome() + " tem R$ " + this.saldo + " em sua conta.";
	}
}

