package com.target.treinamento.orientacaoobjeto.dominio.banco;

public enum Taxas {
	MASTERCARD(1,"MASTERCARD",0.1, 0.002, new Master()),
	VISA(2,"VISA", 0.05, 0.001, new Visa()),
	BANRICOMPRAS(3,"BANRICOMPRAS",0.5, 0.003, new Banricompras()),
	CIELO(4,"CIELO",0.3, 0.004, new Cielo());	
	
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
	
	
	public static Taxas getEnum(String nome) {
		for(Taxas taxa : Taxas.values()) {
			if (nome.equalsIgnoreCase(taxa.getNome())) {
				return taxa;
			}
		}
		return null;
	}
}
