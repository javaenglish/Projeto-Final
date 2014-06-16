package com.senac.projetoissues;


public class Login {

	
	private ContaBancoDados contaBancoDados;

	public void Login(String userName, String senha) {
		Conta conta = contaBancoDados.busca(userName);
		if (conta.verificaSenha(senha))
			conta.setLogado(true);
	
	}

	public Login(ContaBancoDados contaBancoDados) {
		this.contaBancoDados = contaBancoDados;
	}

}
