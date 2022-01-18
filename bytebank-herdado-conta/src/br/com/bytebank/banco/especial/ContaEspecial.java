package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	 public ContaEspecial(int agencia, int numero) {
		// TODO Auto-generated constructor stub
		 super(agencia, numero);
	}
	
	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;

	}

}
