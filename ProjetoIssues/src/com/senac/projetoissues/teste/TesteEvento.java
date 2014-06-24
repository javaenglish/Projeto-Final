package com.senac.projetoissues.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.projetoissues.Evento;
import com.senac.projetoissues.Usuario;

import static org.mockito.Mockito.*;



public class TesteEvento{
	Evento evento;
	Usuario criador;
	
	@Before
	public void setUp() throws Exception {
		this.evento = mock(Evento.class);
		this.criador = mock(Usuario.class);
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

}
