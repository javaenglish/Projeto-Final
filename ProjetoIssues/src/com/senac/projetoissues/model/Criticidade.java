package com.senac.projetoissues.model;

public enum Criticidade {
	
	BLOCKER("BLOCKER", 5),
	CRITICAL("CRITICAL", 4),
	HIGH("HIGH", 3),
	MEDIUM("MEDIUM", 2),
	LOW("LOW", 1);
	
	private String descricao;
	private int nivel;
	private Criticidade(String descricao, int nivel) {
		this.descricao = descricao;
		this.nivel = nivel;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	
}
