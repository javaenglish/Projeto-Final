package com.senac.projetoissues.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class TesteEvento {
	
	private Evento evento;
	private Evento datacriacao;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDataCriacao() {
		evento = mock(Evento.class);
		assertEquals(dataCriacao,evento.getDataCriacao);
		
		
		
	}

}
