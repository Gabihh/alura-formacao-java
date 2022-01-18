package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		long ini = System.currentTimeMillis();
		
//		OutputStream fos = new FileOutputStream("arquivo-teste2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//FileWriter fw = new FileWriter("arquivo-teste2.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo-teste2.txt"));
		bw.write("Testando escrita no java.io");
		bw.newLine();
		//bw.write(System.lineSeparator());
		//bw.write("\r\n");//caracter especial de nova linha e para pular linha - símbolo de caracter especial(\)
		bw.write("Testando escrita no java.io linha 2");
				
		bw.close();
		
		long fim = System.currentTimeMillis();

        System.out.println("Passaram " + (fim - ini) + " milissegundos");
	}

}
