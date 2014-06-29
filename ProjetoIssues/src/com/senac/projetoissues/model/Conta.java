package com.senac.projetoissues.model;

public interface Conta {

	public boolean senhaCompativel(String anyString);

	public void setLogado(boolean status);

	public boolean verificaUserName(String anyString);

	public boolean isLogado();

}
