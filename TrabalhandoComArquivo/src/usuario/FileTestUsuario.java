package usuario;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTestUsuario {
		
	public static void main(String[] args) {
//criando um objeto User
		Usuario user = new Usuario();
		user.setId(1);
		user.setNome("Jim");
		user.setObservacao("Cantor de Rock");
					//Chamando o m�todo escrever e passando user como par�metro
				escrever(user);
				
		
		Usuario user2 = new Usuario();
		user2.setId(2);
		user2.setNome("John");
		user.setObservacao("Empresario Brasileiro");
				escrever(user2);
	}
	
	private static void escrever(Usuario user) {
		File dir = new File("C:\\TutorialArquivos");
		File arq = new File(dir, "Usuario.txt");
		try {
			//neste ponto criamos o arquivo fisicamente			
			arq.createNewFile();
			
			//Devemos passar no construtor do FileWriter
			// qual arquivo vamos manipular.
			// Esse construtor aceita dois tipos de par metros,
			// File ou String.
			//O par�metro true indica que reescrevemos
			// no arquivo sem apagar o que j� existe.
			// O false apagaria o conte�do do arquivo e escreveria
			// o novo conte�do.
			// Se n�o usar o 2� par�metro, ele por padr�o ser� false.
			//O mais importante, essa linha abre o fluxo do arquivo
			FileWriter fileWriter = new FileWriter(arq);			
			
			//Agora vamos usar a classe PrintWriter para escrever
			//fisicamente no arquivo.
			//Precisamos passar o objeto FileReader em seu construtor
			PrintWriter printWriter = new PrintWriter(fileWriter);			
			
			//Agora vamos escrever no arquivo com o m�todo println(),
			// que nos permite escrever linha a linha no arquivo
			printWriter.println(user.getId());
			printWriter.println(user.getNome());
			printWriter.println(user.getObservacao());
			
			//o m�todo flush libera a escrita no arquivo
			printWriter.flush();
			
			//No final precisamos fechar o arquivo
			printWriter.close();
			} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (arq.exists())
			System.out.println("Arquivo existe!");
	
		}
}