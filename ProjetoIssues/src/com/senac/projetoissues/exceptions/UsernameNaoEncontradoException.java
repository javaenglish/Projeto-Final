package com.senac.projetoissues.exceptions;

public class UsernameNaoEncontradoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2245709396659682140L;

	public UsernameNaoEncontradoException (){
		super("Username n�o encontrado, deseja criar um novo?");
	}
}
