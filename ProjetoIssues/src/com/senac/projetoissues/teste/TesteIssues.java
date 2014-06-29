package com.senac.projetoissues.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import com.senac.projetoissues.model.Issue;

public class TesteIssues {

	@Before
	public void setUp() throws Exception {
		Issue issue = mock(Issue.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
