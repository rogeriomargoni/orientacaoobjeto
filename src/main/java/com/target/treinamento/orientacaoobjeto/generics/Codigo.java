package com.target.treinamento.orientacaoobjeto.generics;

public class Codigo<T> {
	
	private T identificador;

	
	@Override
	public String toString() {
		return "" + identificador;
	}
		
	
	public Codigo(T identificador) {
		super();
		this.identificador = identificador;
	}



	public T getIdentificador() {
		return identificador;
	}

	public void setIdentificador(T identificador) {
		this.identificador = identificador;
	}
}
