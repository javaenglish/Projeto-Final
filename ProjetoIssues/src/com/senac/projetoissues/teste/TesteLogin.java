package com.senac.projetoissues.teste;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.projetoissues.Conta;
import com.senac.projetoissues.ContaBancoDados;
import com.senac.projetoissues.Login;
import com.senac.projetoissues.Usuario;

public class TesteLogin {

	private Usuario usuario;
	private Login login;
	private Conta conta;
	private ContaBancoDados contaBancoDados;
	
	@Before
	public void setUp() throws Exception {
		usuario = mock(Usuario.class);
		conta = mock(Conta.class);
		contaBancoDados = mock(ContaBancoDados.class);
		when(contaBancoDados.busca(anyString())).thenReturn(conta);
		
		login = new Login(contaBancoDados);
	}
	
	private void verificaSenha (boolean senha) {
			when(conta.verificaSenha(anyString())).thenReturn(senha);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testaLogarSeSenhaEUserNameEstaoCorretos() {
		verificaSenha (true);
		
		login.Login("Rafa", "Senha Correta");
		
		verificaUserName(true);
		
	}

	private void verificaUserName(boolean b) {
		
	}
	
}
