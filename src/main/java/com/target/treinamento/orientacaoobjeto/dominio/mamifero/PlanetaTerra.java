package com.target.treinamento.orientacaoobjeto.dominio.mamifero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlanetaTerra {
	
	public static void main(String[] args) {
		PlanetaTerra pt = new PlanetaTerra();
		pt.inicializa();
	}
	
	public void inicializa() {
		Mamifero leao     = new Leao();
		Mamifero golfinho = new Golfinho();
		
		/*
		leao.nadar();
		golfinho.nadar();
		
		leao.comer();
		golfinho.comer();

		leao.respirar();
		golfinho.respirar();

		leao.dormir();
		golfinho.dormir();

		leao.pular();
		golfinho.pular();
		*/

		//List<Mamifero> minhaLista = new ArrayList<Mamifero>();
		List<Mamifero> minhaLista = new LinkedList<Mamifero>();
		minhaLista.add(leao);
		minhaLista.add(golfinho);
		
		for (Mamifero mamifero : minhaLista) {
			mamifero.nadar();
			mamifero.comer();
			mamifero.respirar();
			mamifero.dormir();
			mamifero.pular();
		}		
	}	
}
