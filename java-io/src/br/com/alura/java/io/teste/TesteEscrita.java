package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com um arquivo
		OutputStream fos = new FileOutputStream("arquivo-teste2.txt");//arquivo para byte
		Writer osw = new OutputStreamWriter(fos);//byte para caracter
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Testando escrita no java.io");
		bw.newLine();
		bw.newLine();
		bw.write("Testando escrita no java.io linha 2");
				
		bw.close();
	}

}
