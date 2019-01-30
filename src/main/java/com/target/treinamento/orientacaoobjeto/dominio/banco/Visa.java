package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Visa implements Cartao{

	public void debito(Double valor) {
		System.out.println("VISA - Utilizando debito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.VISA.getValorTaxa()));
	}

	public void credito(Double valor) {
		System.out.println("VISA - Utilizando credito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.VISA.getValorTaxa()));
	}
}
