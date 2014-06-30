package com.senac.projetoissues.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.projetoissues.lista.Lista;

import static org.mockito.Mockito.*;

public class TesteLista {

	public Lista lista;
	@Before
	public void setUp() throws Exception {
		lista = mock(Lista.class);
	}

	@After
	public void tearDown() throws Exception {
		lista = null;
	}

	@Test
	public void testeAdicionandoHeadETail() {
		lista.adicionar(1);
		
		assertTrue(lista.getHead().getValor().equals(1) && lista.getTail().getValor().equals(1));
	}

}
