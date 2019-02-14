package com.target.treinamento.orientacaoobjeto.abstracao;

public class Diretor extends Funcionario  {

	@Override
	public Double getBonificacao() {
		return 2.2;
	}
	
	@Override
	public Double getSalario() {
		return 10000.0;
	}	
}
