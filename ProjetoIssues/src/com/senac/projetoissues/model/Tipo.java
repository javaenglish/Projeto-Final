package com.senac.projetoissues.model;

public enum Tipo {

	BUG("BUG"),
	ENHANCEMENT("ENHANCEMENT");

	private String descricao;

	private Tipo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
