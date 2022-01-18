package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//br.com.bytebank.banco.teste.TesteContas
public class TesteContas {
	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Conta Corrente (saldo): R$" + cc.getSaldo());
		System.out.println("Conta Poupança (saldo): R$" + cp.getSaldo());
		
		try(Conta conta = new ContaCorrente(-111, 222)) {
			System.out.println("Conta Criada!");
		} catch (IllegalArgumentException e) {
			System.out.println("Conta não criada! " + e.getMessage() );
		}
		
		try(Conta conta = new ContaCorrente(111, -222)) {
			System.out.println("Conta Criada!");
		} catch (IllegalArgumentException e) {
			System.out.println("Conta não criada! " + e.getMessage() );
		}
		
		try(Conta conta = new ContaCorrente(111, 222)) {
			System.out.println("Conta Criada!");
		} catch (IllegalArgumentException e) {
			System.out.println("Conta não criada! " + e.getMessage() );
		}
		
	}
}
