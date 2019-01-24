package com.target.treinamento.orientacaoobjeto.dominio;

import java.util.Calendar;

public class Disciplina {
	private String nome;
	private Calendar dtinicio;
	private Calendar dtfim;
	private String ch;
	private String conteudo;
	
	
	
	// pegar
	public String getNome(){
		return this.nome;
	}
	
	//setar
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public Calendar getDtinicio(){
		return this.dtinicio;
	}
	
	public void setDtinicio(Calendar dtinicio) {
		this.dtinicio = dtinicio;
	}

	
	public Calendar getDfim(){
		return this.dtfim;
	}
	
	public void setDtfim(Calendar dtfim) {
		this.dtfim = dtfim;
	}
	

	public String getCh(){
		return this.ch;
	}
	
	public void setCh(String ch) {
		this.ch = ch;
	}

	
	public String getConteudo(){
		return this.conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	
}
