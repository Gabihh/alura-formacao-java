package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		String vazio = " ";
		System.out.println(vazio.isEmpty());
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		
		String teste = " Alura ";
		String teste2 = teste.trim();
		System.out.println(teste.contains("Alu"));
		System.out.println(teste2);
		
		
//		int a = 3;
		String nome = "Alura";//object literal
//		String outro = new String("Alura");
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
//		char c = 'A';
//		char d = 'a';
		
//		String outra = nome.replace(c, d);
//		String outra = nome.toUpperCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
	}

}
