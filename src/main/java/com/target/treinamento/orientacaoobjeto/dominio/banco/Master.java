package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Master implements Cartao{

	public Double debito(Double valor, String nome) {
		System.out.println("Cliente: "+ nome + "   utilizou MASTER - no debito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.MASTERCARD.getValorTaxa()));
		return valor - (valor*Taxas.MASTERCARD.getValorTaxa()) - (valor*Taxas.MASTERCARD.getCofins());
	}

	public Double credito(Double valor, String nome) {
		System.out.println("Cliente: "+ nome + "   utilizou MASTER - no credito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.MASTERCARD.getValorTaxa()));
		return valor - (valor*Taxas.MASTERCARD.getValorTaxa()) - (valor*Taxas.MASTERCARD.getCofins());
	}
}
