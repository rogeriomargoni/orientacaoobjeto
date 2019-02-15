package com.target.treinamento.orientacaoobjeto.extratobanco;

public class ContaCorrente extends Extrato{

	@Override
	public void detalheExtrato() {
		System.out.println("Conta Corrente");
		System.out.println("       Debito = 1000");
		System.out.println("       Credito= 2000");
	}
}
