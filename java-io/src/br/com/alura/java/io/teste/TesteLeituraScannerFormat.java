package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScannerFormat {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);//definir as regras segundo uma determinada regi?o
			linhaScanner.useDelimiter(",");
			
			String conta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			//new Locale("pt","BR") - criar um locale
			System.out.format(new Locale("pt", "BR"), "%s - %04d - %08d - %s - R$%5.2f \n", 
					conta, agencia, numero, titular, saldo);
			//String valorFormatado = String.format(Locale.US, "%s - %04d - %08d - %s - R$%5.2f", conta, agencia, numero, titular, saldo);
			//String valorFormatado = String.format("Conta: %s - Ag?ncia: %04d - N?mero: %08d - Titular: %s - Saldo: R$%5.2f", conta, agencia, numero, titular, saldo);
			//System.out.println(conta + ", " + agencia + ", " + numero + ", " + titular + ", " + saldo);
			//System.out.println(valorFormatado);
			
			linhaScanner.close();
			
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
		}
		
		scanner.close();
	}
}
