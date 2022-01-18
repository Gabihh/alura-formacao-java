package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {
	public static void main(String[] args) {
		GuardadorDeReferencias guardador = new GuardadorDeReferencias();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cp = new ContaPoupanca(123, 321);
		guardador.adiciona(cp);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Gabriela");
		guardador.adiciona(cliente);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta refC = (Conta) guardador.getReferencia(0);
		Object refP = guardador.getReferencia(1);
		Object refCli = guardador.getReferencia(2);
		System.out.println("Conta corrente - número: " + refC.getNumero());
		System.out.println("Conta poupança - número: " + ((Conta) refP).getNumero());
		System.out.println("Cliente - nome: " + ((Cliente) refCli).getNome());
	}
}
