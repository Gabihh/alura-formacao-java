package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	public static void main(String[] args) {
//		int[] idades = new int[5];
//		String[] nomes = new String[5];
		
		int idade = 29; //Primitivo - Integer 
		//Integer idadeRef = new Integer(29);
		Integer idadeRef = Integer.valueOf(idade); //autoboxing
		System.out.println(idadeRef.doubleValue());

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		System.out.println(idadeRef.intValue()); //unboxing
		String s = args[0]; //"10" 
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		// Internamente a lista cria um objeto do primitivo para que assim seja armazenada a referência
		List<Integer> numeros = new ArrayList<Integer>(); //Lista armazena apenas referências 
		numeros.add(21); //Autoboxing
		numeros.add(idadeRef);
		
		int i1 = numeros.get(0);
		Integer i2 = numeros.get(1);
		
		System.out.println(i1);
		System.out.println(i2);
	}
}
