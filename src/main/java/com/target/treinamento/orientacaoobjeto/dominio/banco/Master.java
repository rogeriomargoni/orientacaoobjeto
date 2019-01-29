package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Master implements Cartao{

	public void debito(Double valor) {
		System.out.println("MASTER - Utilizando debito de R$ " + valor);
	}

	public void credito(Double valor) {
		System.out.println("MASTER - Utilizando credito de R$ " + valor);
	}

}
