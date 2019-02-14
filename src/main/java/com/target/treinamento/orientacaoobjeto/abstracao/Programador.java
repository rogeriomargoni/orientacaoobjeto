package com.target.treinamento.orientacaoobjeto.abstracao;

public class Programador extends Funcionario{
	
	@Override
	public Double getBonificacao() {
		return 5.0;
	}
	
	@Override
	public Double getSalario() {
		return 5000.0;
	}
}
