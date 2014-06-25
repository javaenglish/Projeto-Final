package com.senac.projetoissues.model;

public interface Conta {

	public boolean verificaSenha(String anyString);

	public void setLogado(boolean status);

	public boolean verificaUserName(String anyString);

}
