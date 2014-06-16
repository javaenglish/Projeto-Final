package com.senac.projetoissues;

public interface Conta {

	public boolean verificaSenha(String anyString);

	public void setLogado(boolean status);

	public boolean verificaUserName(String anyString);

}
