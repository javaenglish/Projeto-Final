package com.senac.projetoissues.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import com.senac.projetoissues.model.Usuario;

public class TesteUsuario {

	@Before
	public void setUp() throws Exception {
		Usuario usuario = mock(Usuario.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testeCadastraUsuarios() {
		
	}

}
