package com.senac.projetoissues;

public class SenhaIncorretaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2497414762094841607L;
		
	public SenhaIncorretaException(){
	
		super("Seu login não pode ser efetuado, verifique os campos de novo");

	}
}
