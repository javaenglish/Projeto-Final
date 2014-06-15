package com.senac.projetoissues.model;

public class Evento {
	
	private int dataCriacao;
	private String comentario;
	private Usuario criador;
	
	
	public Evento(int dataCriacao, String comentario, Usuario criador) {
		this.dataCriacao = dataCriacao;
		this.comentario = comentario;
		this.criador = criador;
	}
	
	public int getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(int dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public Usuario getCriador() {
		return criador;
	}
	
	public void setCriador(Usuario criador) {
		this.criador = criador;
	}

}
