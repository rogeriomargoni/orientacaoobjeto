package com.target.treinamento.orientacaoobjeto.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
				
		Produto p1 = new Produto(new Codigo<String>("CKM0011F19"), "TV", 5);
		Produto p2 = new Produto(new Codigo<String>("CKM0325432F9"), "Radio", 2);
		Produto p3 = new Produto(new Codigo<Integer>(2341234), "Monitor", 1);
		Produto p4 = new Produto(new Codigo<Integer>(5765554), "VideoCassete", 2);
		Produto p5 = new Produto(new Codigo<Double>(1123.14), "TocaCD", 7);
		Produto p6 = new Produto(new Codigo<Double>(457.45), "Banana", 8);
		Produto p7 = new Produto(new Codigo<String>("VBM347"), "Leite", 4);
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		produtos.add(p6);
		produtos.add(p7);
		
		ControleBusca controleBusca = new ControleBusca();
		controleBusca.setProdutos(produtos);
		
		System.out.println(controleBusca.buscarPorCodigo(5765554));
		System.out.println(controleBusca.buscarPorCodigo(457.45).getCodigo());
				
		// exemplo para colocar somente o nome do produto, colocar o getNomeP no final
		System.out.println(controleBusca.buscarPorCodigo("CKM0011F19").getNomeP());
		
		
	  //Codigo<String> codigoParaBusca = new Codigo<String>("CKM0011F19");
	  //Codigo<Integer> codigoParaBusca = new Codigo<Integer>(5765554);
	  //Codigo<Double> codigoParaBusca = new Codigo<Double>(457.45);
		
	/*	
		for (Produto produto : produtos) {
			
			if (produto.getCodigo().getIdentificador().equals(codigoParaBusca.getIdentificador())) {
				System.out.println("Achou o produto " + produto.getNomeP());
			}
		}	
		*/	
	}
}