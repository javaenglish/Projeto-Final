package com.senac.projetoissues.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.projetoissues.Usuario;

import static org.mockito.Mockito.*;

public class TesteUsuarioLogin {

	private Usuario usuario;
	private Usuario username;
	private Usuario senha;
	
	
	@Before
	public void setUp() throws Exception {
		usuario = mock (Usuario.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testeCriaUsuarioComNomeUsernameESenha() {
		assertEquals(null, usuario.getNome());
		assertEquals(username, usuario.getUsername());
		assertEquals(senha, usuario.getSenha());
	}
}
