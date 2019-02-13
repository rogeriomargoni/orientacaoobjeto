package com.target.treinamento.orientacaoobjeto.classeaninhada;

import com.target.treinamento.orientacaoobjeto.dominio.Pessoa;

interface MinhaInterface {
	void foo();
}

public class Fora {

	//Classe anônima
	static MinhaInterface minhaInterface = new MinhaInterface(){
		public void foo() {
			System.out.println("Minha Classe Anonima");
		}	
	};
	
	
	//mudar o metodo da pessoa aqui dentro
	Pessoa pessoa = new Pessoa() {
		@Override
		public String toString() {
			return "Meu novo to string";
		}
	};
	
}