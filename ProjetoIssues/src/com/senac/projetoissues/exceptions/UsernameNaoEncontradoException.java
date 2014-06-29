package com.senac.projetoissues.exceptions;

public class UsernameNaoEncontradoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2245709396659682140L;

	public UsernameNaoEncontradoException (){
		super("Username não encontrado, deseja criar um novo?");
	}
}
