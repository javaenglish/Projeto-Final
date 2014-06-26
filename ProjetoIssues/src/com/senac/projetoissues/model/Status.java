package com.senac.projetoissues.model;

public enum Status {


	NOVO("NOVO"),
	ABERTO("ABERTO"),
	EM_DEV("EM DESENVOLVIMENTO"),
	CLOSED("CLOSED"),
	DUPLICADO("DUPLICADO"),
	ATRIBUIDO("ATRIBUIDO"),
	WONT_FIX("WONT FIX");
	
	private String descricao;

	private Status(String descricao) {
		this.setDescricao(descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
