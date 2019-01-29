package com.target.treinamento.orientacaoobjeto.dominio.banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transacoes {

	public static void main(String[] args) {
		Transacoes tr = new Transacoes();
		tr.inicializa();
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
			
		if (operacao == 1) {
			cartao.debito(valor);	
		} else {
			cartao.credito(valor);			
		}
	}
	
	
	private Integer lerBandeira() {
		return new Scanner(System.in).nextInt();
	}
	
	
	private Integer lerOperacao() {
		return new Scanner(System.in).nextInt();
	}

	private Double lerValor() {
		return new Scanner(System.in).nextDouble();
	}

}