package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Pessoa {
	private String nome;
	private String rg;
	
	
	public Pessoa(String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
	}

	public String getRg(){
		return this.rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	@Override
	public String toString() {
		return "O cliente " + this.getNome() + " possui o RG : " + this.getRg();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Pessoa) {
			Pessoa pessoaParametro = (Pessoa) obj;
			
			return this.nome.equals(pessoaParametro.getNome()) && this.rg.equals(pessoaParametro.getRg());
		}
		
		return super.equals(obj);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {

		Pessoa novaPessoa = new Pessoa(this.nome, this.rg); 
		novaPessoa.setNome(String.valueOf(this.nome));
		novaPessoa.setRg(String.valueOf(this.rg));
		
		return novaPessoa;
	}
		
}
