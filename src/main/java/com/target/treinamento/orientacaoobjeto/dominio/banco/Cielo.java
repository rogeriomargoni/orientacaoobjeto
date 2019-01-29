package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Cielo implements Cartao{

	public void debito(Double valor) {
		System.out.println("CIELO - Utilizando debito de R$ " + valor);
	}

	public void credito(Double valor) {
		System.out.println("CIELO - Utilizando credito de R$ " + valor);
	}

}
