package com.target.treinamento.orientacaoobjeto.extratobanco;

public class Dividendos extends Extrato{

	@Override
	public void detalheExtrato() {
		System.out.println("Dividendos");
		System.out.println("       Valor  = 3000");
		System.out.println("       Lucro  = 4000");
	}
}
