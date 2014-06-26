package com.senac.projetoissues.model;


public class Issue {
	
	private String titulo;
	private String descricao;
	private int dataCriacao;
	private Criticidade criticidade;
	private Tipo tipo;
	private Status status;
	private Usuario criador;
	private Evento eventos;
	private int contaNumEventos;
	
	
	public Issue(String titulo, String descricao, int dataCriacao,
			Criticidade criticidade, Tipo tipo, Status status, Usuario criador,
			Evento eventos, int contaNumEventos) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
		this.criticidade = criticidade;
		this.tipo = tipo;
		this.status = status;
		this.criador = criador;
		this.eventos = eventos;
		this.contaNumEventos = contaNumEventos;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(int dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public Criticidade getCriticidade() {
		return criticidade;
	}


	public void setCriticidade(Criticidade criticidade) {
		this.criticidade = criticidade;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public Usuario getCriador() {
		return criador;
	}


	public void setCriador(Usuario criador) {
		this.criador = criador;
	}


	public Evento getEventos() {
		return eventos;
	}


	public void setEventos(Evento eventos) {
		this.eventos = eventos;
	}


	public int getContaNumEventos() {
		return contaNumEventos;
	}


	public void setContaNumEventos(int contaNumEventos) {
		this.contaNumEventos = contaNumEventos;
	}

	
	
}
