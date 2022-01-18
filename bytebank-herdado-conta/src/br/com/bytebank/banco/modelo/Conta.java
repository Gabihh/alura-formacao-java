package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa a moldura de uma conta no Bytebank
 * @author Gabriela Brito
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, AutoCloseable, Serializable {
	protected double saldo;
	private int agencia;
	private int numero;
	//private transient Cliente titular;//anota��o transient - n�o ser� gravado no objeto
	private Cliente titular;
	
	// Atributo da classe
	private static int total = 0;
	
	// Contrutor padr�o
	// public Conta() {}
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da ag�ncia e n�mero.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas � " + Conta.total);
		
		if(agencia < 1) {
			throw new IllegalArgumentException("Ag�ncia Inv�lida!");
		}
		this.agencia = agencia;
		
		if(numero < 1) {
			throw new IllegalArgumentException("N�mero da conta inv�lido!");
		}
		this.numero = numero;
		// System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior ou igual ao saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo da conta: R$" + this.saldo + ", Valor de saque: R$" + valor);
		}
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode valor menor ou igual a 0");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	// M�todo da classe
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public void close() {
		System.out.println("Sistema finalizado!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "N�mero: " + this.numero + ", Agencia: " + this.agencia;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
}
