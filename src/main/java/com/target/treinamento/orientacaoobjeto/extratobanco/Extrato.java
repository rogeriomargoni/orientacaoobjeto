package com.target.treinamento.orientacaoobjeto.extratobanco;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Extrato {
	
	public void cabecalho(){
		System.out.println("===================================");
		System.out.println("        Banco Meridional           ");
		System.out.println("Conta : 0001-2 Agencia: Galo Cinza");
		System.out.println(" ");
	}

	
	public abstract void detalheExtrato();	
	
	
	public void rodape(){
		System.out.println(" ");
		System.out.println(" Obrigado por utilizar nosso banco ");
	  //System.out.println("Data : 10/02/1990          página 1");

		DateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date();
		System.out.println(dataFormato.format(data)); 
		
		
		
		System.out.println("==================================="+"\n\n");
	}
}
