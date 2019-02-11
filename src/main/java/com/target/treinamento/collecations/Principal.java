package com.target.treinamento.collecations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Principal {
	public static void main(String[] args) {

		//usar a interface como tipo de variavel
		//Interface minhaVariavel = new Implementacao
		
		/*
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("Joao");
		hashSet.add("Pedro");
		hashSet.add("Maria");
		hashSet.add("Eduardo");
		hashSet.add("Joao");
		hashSet.add("Marta");
		hashSet.add("Joana");
		
		for (String valor : hashSet) {
			System.out.println(valor);
		}

		System.out.println("");
		*/
		
		/*
		List<String> minhaLista = new ArrayList<String>();
		
		minhaLista.add("Joao");
		minhaLista.add("Pedro");
		minhaLista.add("Maria");
		minhaLista.add("Eduardo");
		minhaLista.add("Joao");
		minhaLista.add("Marta");
		minhaLista.add("Joana");
		
		for (String valor : minhaLista) {
			System.out.println(valor+"  -  "+valor.hashCode());
		}
        */
		
		
		// o tipo HashMap pede put 
		/*
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1","Joao");
		map.put("2","Pedro");
		map.put("3","Maria");
		map.put("4","Eduardo");
		map.put("5","Joao");
		map.put("6","Marta");
		map.put("7","Joana");	

		System.out.println("");
		System.out.println(map.get("3"));
        */
	
	
	
		List<Integer> minhaReversao  = new ArrayList<Integer>();
		
		minhaReversao.add(15);
		minhaReversao.add(-25);
		minhaReversao.add(12);
		minhaReversao.add(9);
		minhaReversao.add(20);
		minhaReversao.add(45);
		minhaReversao.add(19);
		minhaReversao.add(74);
		minhaReversao.add(-45);
		minhaReversao.add(0);
		minhaReversao.add(0);
		minhaReversao.add(0);
		minhaReversao.add(1);
		minhaReversao.add(22);
		minhaReversao.add(1);
		minhaReversao.add(2);

		Collections.reverse(minhaReversao);
		System.out.println(minhaReversao);
		
		System.out.println("");
		List<Integer> minhaDuplicada = new ArrayList<Integer>(minhaReversao);
		
		Collections.copy(minhaDuplicada, minhaReversao); 
		System.out.println(minhaDuplicada);

		System.out.println("");
		Collections.sort(minhaReversao);
		System.out.println(minhaReversao);

		System.out.println("");
		System.out.println(minhaReversao.get(10));
		
		
		List<Integer> linkedList = new LinkedList<Integer>(minhaReversao);	
		Iterator<Integer> iterator = linkedList.iterator();
		
		System.out.println("");
		
		
		int contador = 1;
		while(iterator.hasNext()) {
			Integer elemento = iterator.next();
			System.out.println(contador +" -> "+ elemento);
			contador++;
		}
		

		// revertendo os valores da linkedlist
		LinkedList<Integer> linkedListReverso = new LinkedList<Integer>(minhaReversao);	
		Iterator<Integer> iteratorReverso = linkedListReverso.descendingIterator();
		
		System.out.println("");
		
		
		contador = 1;
		while(iteratorReverso.hasNext()) {
			Integer elemento = iteratorReverso.next();
			System.out.println(contador +" -> "+ elemento);
			contador++;
		} 
	}
}
