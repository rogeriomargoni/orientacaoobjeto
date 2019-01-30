package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Banricompras implements Cartao{

	public void debito(Double valor) {
		System.out.println("BANRICOMPRAS - Utilizando debito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.BANRICOMPRAS.getValorTaxa()));
	}

	public void credito(Double valor) {
		System.out.println("BANRICOMPRAS - Utilizando credito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.BANRICOMPRAS.getValorTaxa()));
	}
}
