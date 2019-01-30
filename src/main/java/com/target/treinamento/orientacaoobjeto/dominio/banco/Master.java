package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Master implements Cartao{

	public void debito(Double valor) {
		System.out.println("MASTER - Utilizando debito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.MASTER_CARD.getValorTaxa()));
	}

	public void credito(Double valor) {
		System.out.println("MASTER - Utilizando credito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.MASTER_CARD.getValorTaxa()));
	}

}
