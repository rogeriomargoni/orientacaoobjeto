package com.target.treinamento.orientacaoobjeto.generics;

public interface Busca {
	<T> Produto buscarPorCodigo(T id);
}
