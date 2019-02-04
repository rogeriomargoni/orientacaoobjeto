package com.target.treinamento.collecations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {

		//usar a interface como tipo de variavel
		//Interface minhaVariavel = new Implementacao
		
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

		
		
		// o tipo HashMap pede put 
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
	}
}
