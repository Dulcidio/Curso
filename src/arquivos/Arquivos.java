package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {
	
	public static void main(String args[]) {
		
	   escrever();
		ler();
		pastas();
	}

	
	static void  escrever() {
		String[] linhas = new String[] {"dia","tarde","noite","manhã"};
		String caminho = "C:\\temp\\out.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
			for(String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	static void ler() {
		String caminho = "C:\\temp\\out.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String linha = br.readLine();
			while(linha!=null) {
				System.out.println(linha);
				linha=br.readLine();
			}
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	 
	static void pastas() {
		
		String caminho = "C:\\temp";
		File fl = new File(caminho);
		
		File[]pastas =fl.listFiles(File::isDirectory);
		
		System.out.println("Pastas");
		for(File f : pastas) {
			System.out.println(f);
		}
		File[]arquivos=fl.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for(File f : arquivos) {
			System.out.println(f);
		}
		boolean sucesso = new File(caminho + "\\subdir").mkdir();
		System.out.println("Acesso permitido " +sucesso);
		
	
	}
}
 
