package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Cielo implements Cartao{

	public void debito(Double valor) {
		System.out.println("CIELO - Utilizando debito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.CIELO.getValorTaxa()));
	}

	public void credito(Double valor) {
		System.out.println("CIELO - Utilizando credito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.CIELO.getValorTaxa()));
	}

}
