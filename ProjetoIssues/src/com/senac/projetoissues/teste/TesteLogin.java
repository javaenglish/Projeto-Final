package com.senac.projetoissues.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.projetoissues.Usuario;

public class TesteLogin {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testaSenhaUsuario() {
		Usuario usuario = new Usuario();
		assertEquals(null, usuario.getSenha());
		
	}

}
