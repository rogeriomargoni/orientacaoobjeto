package com.target.treinamento.orientacaoobjeto.reflections;

import com.target.treinamento.orientacaoobjeto.abstracao.Funcionario;

public class Principal {

	public static void main(String[] args) {
		new Principal().reflections();
	}
	
	//reflections server para instanciar em tempo de runtime
	//instanciamos gerente sem importar ele	
	private void reflections() {
		try {
			Funcionario funcionario = (Funcionario) Class.forName("com.target.treinamento.orientacaoobjeto.abstracao.Gerente").newInstance();

			System.out.println(funcionario);
			
		
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}	
}