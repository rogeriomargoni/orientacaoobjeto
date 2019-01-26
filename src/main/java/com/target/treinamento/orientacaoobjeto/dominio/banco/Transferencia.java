package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Transferencia {
	private Integer id;
	private Conta contaOrigem;
	private Conta contaDestino;
	private Double valor;
	private String tipo;
	
	
	public Transferencia(Integer id, Conta contaOrigem, Conta contaDestino, Double valor, String tipo) {
		this.id = id;
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.valor = valor;
	}

	


	public Conta getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(Conta contaOrigem) {
		this.contaOrigem = contaOrigem;
	}


	public Conta getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}



	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	
	public void exibirDados() {
		
	}


	public void transferir() {
		
			System.out.println(contaOrigem.getNumero());
			System.out.println(contaDestino.getNumero());
			
			System.out.println(valor);
			
			System.out.println(contaOrigem.getSaldo());
			System.out.println(contaDestino.getSaldo());
			
			
			contaDestino.setSaldo(contaDestino.getSaldo() + valor);
			
			System.out.println(contaDestino.getSaldo());
	}
}
