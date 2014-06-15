package com.senac.projetoissues.view;

import java.util.Scanner;

public class IssuesView {
	
	Scanner entrada = new Scanner (System.in);

	public String adicionaUsuario () {
		System.out.println("Por favor digite seu primeiro nome");
		return entrada.nextLine();
	}
	
	public int adicionaSenha () {
		System.out.println("Escolha uma senha numerica de 4 digitos para seu Login");
		return entrada.nextInt();
	}
	public void usuarioAdicionado(){
		System.out.println("Usuario adicionado com sucesso");
	}
	
	public int menu()	{
		
		System.out.println( "Opções do sistema"
				+ "\n1 - Criar novou usuário"
				+ "\n2 - Criar novopProjeto"
				+ "\n3 - Listar projetos existentes"
				+ "\n4 - Criar Evento"
				+ "\n5 - Criar Issue"
				+ "\n6 - Logout");
		return entrada.nextInt();		
	}
}
