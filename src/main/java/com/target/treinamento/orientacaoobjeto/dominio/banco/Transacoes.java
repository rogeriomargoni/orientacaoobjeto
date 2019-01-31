package com.target.treinamento.orientacaoobjeto.dominio.banco;

import java.io.BufferedReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.portable.InputStream;

public class Transacoes {

	public static void main(String[] args) {

		//Enum é um conjunto de constantes do mesmo tipo
		
		//System.out.println(Taxas.MASTER_CARD.equals(Taxas.VISA));
		//System.out.println(Taxas.VISA.getCodigo());
		//System.out.println(Taxas.VISA.getNome());
		//System.out.println(Taxas.VISA.getValorTaxa());
		//System.out.println(Taxas.VISA.getCofins());

		
		// exceção checada - FILENOTFOUNDEXCEPTION
		// exceção não checada - ILLEGALARGUMENTEXCEPTION
		
		Scanner scanner = new Scanner(System.in);
		String entradaUsuaio = scanner.next();
		
		try {
			Integer a = Integer.valueOf("5.5");
			
			Integer b = Integer.valueOf("5");
			
			System.out.println(a/b);
		} catch (NumberFormatException e) {
			System.out.println("Meu amigo, voce informou um valor invalido, entre somente com numeros inteiros");
		} catch (ArithmeticException exception) {
			System.out.println("Não foi possivel efetuar o calculo");
		}
		
		
		/*
		public void meuMetodoComExcecaoChecada(Double value) throws FileNotFoundException {
			throw new FileNotFoundException("Este arquivo nao foi encontrado")  
		}
		
		public void meuMetodoSemChecar() throws IllegalArgumentException {
			throw new IllegalArgumentException("Este arquivo nao foi encontrado")
		}
		*/
		
						
		Transacoes tr = new Transacoes();
		tr.inicializa();
	}

	
	private void leiaArquivo() throws IOException {
		java.io.InputStream inputStream = new FileInputStream("C:/user/rafale/arquivo.txt");
	
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				
		
		List<String> minhasLinhas = new ArrayList<String>();		
		
		while(true) {
			String linha = bufferedReader.readLine();
			
			if (linha != null) {
				minhasLinhas.add(linha);
			} else {
				break;
			}
		}
	}
	

	
	
	
	private void inicializa() {
		System.out.println("Informe a bandeira desejada:");
		System.out.println("[1] - Visa");
		System.out.println("[2] - Master");
		System.out.println("[3] - Banricompras");
		System.out.println("[4] - Cielo");
		Integer bandeira = lerBandeira();

		
		System.out.println("Informe a operacao:");
		Integer operacao = lerOperacao();

		
		System.out.println("Informe o valor:");
		Double  valor    = lerValor();

		/* 
		// versão utilizando o NEW dentro do IF ---------------------------------		
		Cartao cartao;		
		if (bandeira == 1) {
			cartao = new Visa();
		} else if (bandeira == 2) {
			cartao = new Master();
		} else if (bandeira == 3) {
			cartao = new Banricompras();
		} else {
			cartao = new Cielo();
		}
		--------------------------------------------------------------------------*/			
		
		
		// versão utilizando ENUM com o NEW dentro do ENUM
		if (operacao == 1) {
			Taxas.valueof(bandeira).getCartao().debito(valor);	
		} else {
			Taxas.valueof(bandeira).getCartao().credito(valor);
		}
	}

	
	private Integer lerBandeira() {
		return new Scanner(System.in).nextInt();
	}
	
	
	private Integer lerOperacao() {
		System.out.println("[1] - Debito");
		System.out.println("[2] - Credito");
		return new Scanner(System.in).nextInt();
	}

	private Double lerValor() {
		return new Scanner(System.in).nextDouble();
	}

}