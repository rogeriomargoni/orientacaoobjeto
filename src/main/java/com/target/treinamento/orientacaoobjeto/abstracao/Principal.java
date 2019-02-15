package com.target.treinamento.orientacaoobjeto.abstracao;

public class Principal {
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		principal.inicializa();
	}

	private void inicializa() {
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(new Gerente());
		controleBonificacao.registra(new Programador());
		controleBonificacao.registra(new Diretor());
		
		System.out.println("Total dos salarios bonificados = " +controleBonificacao.getTotalEmBonificacoes());
	}
}
