package com.senac.projetoissues;

import com.senac.projetoissues.model.Conta;


public class Login {

	private Conta conta;
	private ContaBancoDados contaBancoDados;

	public void login(String userName, String senha) {
		Conta conta = contaBancoDados.busca(userName);
		if (conta.verificaSenha(senha))
			conta.setLogado(true);
	}

	public Login(ContaBancoDados contaBancoDados) {
		this.contaBancoDados = contaBancoDados;
	}

}
