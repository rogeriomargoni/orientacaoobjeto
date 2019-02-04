package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Cielo implements Cartao{

	public Double debito(Double valor, String nome) {
		System.out.println("Cliente: "+ nome + "   utilizou CIELO - Utilizando debito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.CIELO.getValorTaxa()));
		return valor - (valor*Taxas.CIELO.getValorTaxa()) - (valor*Taxas.CIELO.getCofins());
	}

	public Double credito(Double valor, String nome) {
		System.out.println("Cliente: "+ nome + "   utilizou CIELO - Utilizando credito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.CIELO.getValorTaxa()));
		return valor - (valor*Taxas.CIELO.getValorTaxa()) - (valor*Taxas.CIELO.getCofins());
	}

}
