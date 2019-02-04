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
	
	@Override
	public boolean equals(Object obj) {
		
		//instanceof verifica se o obj faz parte do Conta, é uma instancia de Conta ?
		if (obj instanceof Conta) {
			
			//se sim, faz o casting (parse) formatando o obj para o tipo Conta
			Conta contaParametro = (Conta) obj;
			
			return this.numero.equals(contaParametro.getNumero()) && 
			this.saldo.equals(contaParametro.getSaldo());
		}
		
		return super.equals(obj);
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Conta novaConta = new Conta(numero, saldo); 
		novaConta.setNumero(Integer.valueOf(this.numero));
		novaConta.setSaldo(Double.valueOf(this.saldo));
		novaConta.setPessoa((Pessoa)pessoa.clone());
		
		return novaConta;
	}
	
}


