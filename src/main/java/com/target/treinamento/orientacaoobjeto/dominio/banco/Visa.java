package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Visa implements Cartao{

	public Double debito(Double valor, String nome) {
		System.out.println("Cliente: "+ nome + "   utilizou VISA - Utilizando debito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.VISA.getValorTaxa()));
		return valor - (valor*Taxas.VISA.getValorTaxa()) - (valor*Taxas.VISA.getCofins());
	}

	public Double credito(Double valor, String nome) {
		System.out.println("Cliente: "+ nome + "   utilizou VISA - Utilizando credito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.VISA.getValorTaxa()));
		return valor - (valor*Taxas.VISA.getValorTaxa()) - (valor*Taxas.VISA.getCofins());
	}
}
