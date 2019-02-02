package com.target.treinamento.orientacaoobjeto.dominio.banco;

public interface Cartao {
	
	void debito(Double valor, String nome);
	void credito(Double valor, String nome);
}
