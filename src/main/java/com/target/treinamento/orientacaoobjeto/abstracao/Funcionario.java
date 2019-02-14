package com.target.treinamento.orientacaoobjeto.abstracao;

//abstração da classe  
//tu pode delegar informações para a classe filha fazer, 
//salario do gerente ficou lá dentro, 
//para ter um valor diferente dos demais funcionarios

public abstract class Funcionario {
	private Double bonificacao = 1.2;
	
	
	// opcional a implementação
	public Double getBonificacao() {
		return bonificacao;
	}


	// obrigatório a implementação
	
	// só podemos colocar um método como abstrato dentro de uma classe abstrata
	// este metodo abstract indica que está sendo delegado a implementação do getSalario para outra classe
	public abstract Double getSalario();
	
	
	//obrigatório ter uma classe pelo menos
	public Double getValorTotalFuncionarioComBonificacao() {
		return getSalario() * getBonificacao();
	}
}	
