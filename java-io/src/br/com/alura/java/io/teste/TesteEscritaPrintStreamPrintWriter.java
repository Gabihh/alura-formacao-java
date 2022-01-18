package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
//		OutputStream fos = new FileOutputStream("arquivo-teste2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		//M�TODOS DE SA�DA DE DADOS
		//BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo-teste2.txt"));
		//PrintStream ps = new PrintStream(new File("arquivo-teste2.txt"));
		PrintWriter ps = new PrintWriter("arquivo-teste2.txt", "UTF-8");
		
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println();
        ps.println("asfasdfsafdas dfs sdf asf assd� - teste de novo - de novo");

        ps.close();
	}

}
