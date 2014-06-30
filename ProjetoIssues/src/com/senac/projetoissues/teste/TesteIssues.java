package com.senac.projetoissues.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.projetoissues.model.Issue;

public class TesteIssues {

	@Before
	public void setUp() throws Exception {
		Issue issue = new Issue("", "", 0, null, null, null, null, null, 0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	
	}

}
