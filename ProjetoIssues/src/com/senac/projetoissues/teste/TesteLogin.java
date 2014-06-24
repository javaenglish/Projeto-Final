package com.senac.projetoissues.teste;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.projetoissues.Conta;
import com.senac.projetoissues.ContaBancoDados;
import com.senac.projetoissues.Login;
import com.senac.projetoissues.SenhaIncorretaException;
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
	
	private void verificaUserName(boolean userName) {
		when(conta.verificaUserName(anyString())).thenReturn(userName);	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testaLogarSeSenhaEUserNameEstaoCorretos() {
		
		verificaUserName(true);
		verificaSenha(true);
		login.login("Rafa", "Senha Correta");
		verify(conta, times(1)).setLogado(true);
		
	}
	
	@Test(expected=SenhaIncorretaException.class)
	public void testeFalhaLoginSeSenhaIncorreta () throws SenhaIncorretaException {
		
		verificaSenha(false);
		
		verify(conta, never()).setLogado(false);
	}
	
	@Test(expected=ClienteNaoEncontradoException.class)
	public void testeFalhaLoginQuandoClienteNaoEncontrado () throws ClienteNaoEncontradoException {
		verificaUserName(false);
		verificaSenha(false);
		
		verify(conta, never()).setLogado(false);
	}
	
}
