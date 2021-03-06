package com.target.treinamento.orientacaoobjeto.dominio.banco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
		
		/*
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
		*/
		
		/*
		public void meuMetodoComExcecaoChecada(Double value) throws FileNotFoundException {
			throw new FileNotFoundException("Este arquivo nao foi encontrado")  
		}
		
		public void meuMetodoSemChecar() throws IllegalArgumentException {
			throw new IllegalArgumentException("Este arquivo nao foi encontrado")
		}
		*/
		
						
		Transacoes tr = new Transacoes();
		
		try {
			tr.leiaArquivo();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		
		MeuDado<String> meuDado = new MeuDado<String>();
		meuDado.setMinhaClasse("Esta é uma classe muito legal");
		meuDado.setNomeDaClasse("MundoJava");
		System.out.println(meuDado.getNomeDaClasse() + ":" + meuDado.getMinhaClasse());

		
		MeuDado<Double> meuDado2 = new MeuDado<Double>();
		meuDado2.setMinhaClasse(56.2);
		System.out.println(meuDado2.getMinhaClasse() + meuDado2.getMinhaClasse());		

		
		MeuDado<Double> meuDado3 = new MeuDado<Double>();
		meuDado3.setMinhaClasse(23.0);
		System.out.println(meuDado2.getMinhaClasse() + meuDado3.getMinhaClasse());		
		
		
		//tr.inicializa();		
	}

	
	private void leiaArquivo() throws IOException {
		java.io.InputStream inputStream = new FileInputStream("C:/Users/sala04/workspace-rogerio/turma/transacoes.txt");
	
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
				
		List<String> minhasLinhas = new ArrayList<String>();		
		
		while(true) {
			String linha = bufferedReader.readLine();
			
			if (linha != null) {
				minhasLinhas.add(linha);
			} else {

				List<Transacao> clientes = new ArrayList<Transacao>();
				
				for (String meuArray : minhasLinhas) {
					
					//transacao é uma classe que foi criada e aqui estamos estanciando ela
					Transacao transacao = new Transacao();

					//split quebra a string pelo caracter desejado
					String[] linhaQuabrada = meuArray.split(";");

					transacao.setBandeira(linhaQuabrada[0]);
					transacao.setOperacao(Integer.valueOf(linhaQuabrada[1]));
					transacao.setValor(Double.valueOf(linhaQuabrada[2]));
					transacao.setNome(linhaQuabrada[3]);

					clientes.add(transacao);
				}
				processaTransacoes(clientes);
				break;
			}
		}
	}
	
	private void processaTransacoes(List<Transacao> clientes) throws IOException {

		
		// escreve para um arquivo, juntamente com o write do método processaTransacoes
		// true no final faz com que ele reescreva o arquivo com os dados após o ultimo registro escrito
		// sem o true teremos que apagar o conteudo para ele colocar novamente
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/sala04/workspace-rogerio/turma/saidaTransacoes.txt", true));
		
		NumberFormat format = DecimalFormat.getInstance(Locale.US);

		//formata o valor para ter no minimo 2 digitos no final
		format.setMinimumFractionDigits(2);
		
		//formata o valor para ter no máximo 2 digitos no final
		format.setMaximumFractionDigits(2);
		
		Integer cont = 0;
		Double somatorio = 0.0;				
		Double mediaValor = 0.0;
		Double menorValor = clientes.get(0).getValor();
		Double maiorValor = 0.0;
		Integer tamanho = 0;
		String sobrenome = "";
		
		for (Transacao transacao : clientes) {

			Taxas meuEnum = Taxas.getEnum(transacao.getBandeira().toUpperCase().trim());
			Cartao cartao = meuEnum.getCartao();

			Double novoValor = 0.0;
			
			if (transacao.getOperacao() == 1) {
				novoValor = cartao.debito(transacao.getValor(), transacao.getNome());	
			} else {
				novoValor = cartao.credito(transacao.getValor(), transacao.getNome());
			}

			if (transacao.getValor() < menorValor) {
				menorValor = transacao.getValor();	
			}

			//Concatenando appends
			//writer.append(novoValor.toString()).append(";");	

			writer.append(meuEnum.getNome())
				.append(";")
				.append(transacao.getOperacao().toString())
				.append(";")
				.append(format.format(novoValor))
				.append(";")		
				.append(transacao.getNome());
			
			writer.newLine();

			somatorio = somatorio + transacao.getValor();
			
			if (transacao.getValor() > menorValor) { 
				menorValor = transacao.getValor();
			}
			
			if (transacao.getValor() > maiorValor) { 
				maiorValor = transacao.getValor();
			}
			cont++;
			
			System.out.println("Nome Bibliográfico = " + transacao.getNome().substring(transacao.getNome().indexOf(" "))+" , "+transacao.getNome().substring(0,transacao.getNome().indexOf(" ")));
			System.out.println("");
		}		

		System.out.println("Valor Total das transações = "+ somatorio);
		System.out.println("Valor Médio das transações = "+ somatorio/cont);
		System.out.println("Menor Valor = " + menorValor);
		System.out.println("Maior Valor = " + maiorValor);
		
		writer.flush();
		writer.close();
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