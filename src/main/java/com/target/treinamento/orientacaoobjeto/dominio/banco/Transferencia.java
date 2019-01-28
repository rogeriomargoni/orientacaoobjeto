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
		if (contaOrigem.getSaldo() < valor) {
			System.out.println("");
			System.out.println("Saldo não é suficiente, transferência CANCELADA !");	
		} else {	
			System.out.println("");
			System.out.println("Valor a transferir: " + valor);
			System.out.println("");
		
			System.out.println("Cliente Origem       = " + this.getContaOrigem().getPessoa().getNome()  + "  Conta -> "+ contaOrigem.getNumero() + "     Saldo da após transferência = " + contaOrigem.getSaldo());
			System.out.println("Cliente Destinatário = " + this.getContaDestino().getPessoa().getNome() + "  Conta -> "+ contaDestino.getNumero()+ "     Saldo da após transferência = " + contaDestino.getSaldo());
		}
	}


	public void transferir() {
			if (contaOrigem.getSaldo() >= valor) {
				contaDestino.setSaldo(contaDestino.getSaldo() + valor);
				contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
			}
	}
}
