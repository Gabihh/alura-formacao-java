package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	public static void main(String[] args) {
		//int[] idaes = new int[5];
		Object[] referencias = new Object[5];
		
		System.out.println(referencias.length);
		
		ContaCorrente cc1 = new ContaCorrente(22,11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(cc2.getNumero());
		
//		Object referenciaGenerica = contas[1];
//		System.out.println(referenciaGenerica.getNumero);//Necessário realizar um cast 
		
		//Conta ref = contas[1];
		ContaPoupanca ref1 = (ContaPoupanca) referencias[1];//type cast - torna numa referência mais específica
		//ContaCorrente ref2 = (ContaCorrente) contas[1];
		System.out.println(ref1.getNumero());
		System.out.println(cc2.getNumero());
	}
}
