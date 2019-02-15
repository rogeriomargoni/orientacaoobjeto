package com.target.treinamento.orientacaoobjeto.extratobanco;

public class Investimentos extends Extrato {

	@Override
	public void detalheExtrato() {
		System.out.println("Investimento");
		System.out.println("       Inicial = 5000");
		System.out.println("       Final   = 6000");		
	}
}
