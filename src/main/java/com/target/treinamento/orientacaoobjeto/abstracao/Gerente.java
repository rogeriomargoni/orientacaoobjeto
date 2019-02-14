package com.target.treinamento.orientacaoobjeto.abstracao;

public class Gerente extends Funcionario {
	
	@Override
	public Double getBonificacao() {
		return 2.2;
	}
	
	
	@Override
	public Double getSalario() {
		return 2000.0;
	}	
}
