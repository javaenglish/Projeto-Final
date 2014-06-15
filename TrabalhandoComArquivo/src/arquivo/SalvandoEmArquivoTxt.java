package arquivo;

import java.io.File;
import java.io.IOException;

public class SalvandoEmArquivoTxt {

	public static void main(String[] args) {
		java.io.File diretorio = new java.io.File("C:\\TutorialArquivos");
		
		boolean statusDir = diretorio.mkdir();
		System.out.println(statusDir);
			
		
		java.io.File arquivo = new java.io.File(diretorio, "arq_01.txt");
		
		try {
			boolean statusArq = arquivo.createNewFile();
				System.out.println(statusArq);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		if (diretorio.exists()) {
			System.out.println("Diretório existe!");
				if (arquivo.exists())
						System.out.println("Arquivo existe!");
		}
		
		File dir = new File("C:\\TutorialArquivos");
		File nome = new File(dir, "arq_01.txt");
		File nomeNovo = new File(dir, "RegistroUsuario.txt");
		
		boolean statusRenomear = nome.renameTo(nomeNovo);
		System.out.println("Renomeado: " + statusRenomear + " - New name: "+nomeNovo);
	}
}
