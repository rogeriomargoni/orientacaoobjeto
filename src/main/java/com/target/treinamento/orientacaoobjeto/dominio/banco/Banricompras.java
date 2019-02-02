package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Banricompras implements Cartao{

	public void debito(Double valor, String nome) {
		System.out.println("Cliente: "+ nome + "   utilizou BANRICOMPRAS - Utilizando debito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.BANRICOMPRAS.getValorTaxa()));
	}

	public void credito(Double valor, String nome) {
		System.out.println("Cliente: "+ nome + "   utilizou BANRICOMPRAS - Utilizando credito de R$ " + valor);
		System.out.println("Será cobrado uma taxa de R$: " + (valor*Taxas.BANRICOMPRAS.getValorTaxa()));
	}
}
