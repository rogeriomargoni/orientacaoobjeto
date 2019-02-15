package com.target.treinamento.orientacaoobjeto.extratobanco;

public class Principal {

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.inicializa();

	}
	
	
	private void inicializa() {
		ContaCorrente contacorrente = new ContaCorrente();
		Investimentos investimento  = new Investimentos();
		Dividendos dividendos       = new Dividendos();
	
	contacorrente.cabecalho();	
	contacorrente.detalheExtrato();
	contacorrente.rodape();
	
	investimento.cabecalho();	
	investimento.detalheExtrato();
	investimento.rodape();

	dividendos.cabecalho();	
	dividendos.detalheExtrato();
	dividendos.rodape();
	}
}
