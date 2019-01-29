package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Banricompras implements Cartao{

	public void debito(Double valor) {
		System.out.println("BANRICOMPRAS - Utilizando debito de R$ " + valor);
	}

	public void credito(Double valor) {
		System.out.println("BANRICOMPRAS - Utilizando credito de R$ " + valor);
	}

}
