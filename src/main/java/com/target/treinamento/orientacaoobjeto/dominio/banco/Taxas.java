package com.target.treinamento.orientacaoobjeto.dominio.banco;

public enum Taxas {
	VISA(1,"Visa", 0.05, 0.001, new Visa()),
	MASTER_CARD(2,"Master Card",0.1, 0.002, new Master()),
	BANRICOMPRAS(3,"BanriCompras",0.5, 0.003, new Banricompras()),
	CIELO(4,"Cielo",0.3, 0.004, new Cielo());	
	
	private Integer codigo;
	private String nome;
	private Double valorTaxa;
	private Double cofins;
	private Cartao cartao;
	
	Taxas(Integer codigo, String nome, Double valorTaxa, Double cofins, Cartao cartao){
		this.codigo = codigo;
		this.nome = nome;
		this.valorTaxa = valorTaxa;
		this.cofins = cofins;		
		this.cartao = cartao;
	}

	public String getNome() {
		return nome;
	}

	public Double getValorTaxa() {
		return valorTaxa;
	}

	public Double getCofins() {
		return cofins;
	}
	
	@Override
	public String toString() {
		return "[nome: "+ this.nome+"] [ taxa:"+this.valorTaxa+"] [ cofins:"+this.cofins+"]";
	}

	public Integer getCodigo() {
		return codigo;
	}
	

	public Cartao getCartao() {
		return cartao;
	}
	
	
	public static Taxas valueof(Integer codigo) {
		for(Taxas taxa : Taxas.values()) {
			if (codigo.equals(taxa.getCodigo())) {
				return taxa;
			}
		}
		return null;
	}
}
