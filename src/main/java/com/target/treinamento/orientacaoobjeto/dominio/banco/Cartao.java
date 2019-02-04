package com.target.treinamento.orientacaoobjeto.dominio.banco;

public interface Cartao {
	Double debito(Double valor, String nome);
	Double credito(Double valor, String nome);
}
