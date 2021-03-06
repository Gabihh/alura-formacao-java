package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	// public ContaCorrente() {
	//  super();
	// }
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		// TODO Auto-generated method stub
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}
	
	@Override
	public void deposita(double valor) {
		// TODO Auto-generated method stub
		super.saldo += valor;
	}
	
	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ContaCorrente, " + super.toString();
	}
}
