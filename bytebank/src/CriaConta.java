

public class CriaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println("Ag�ncia da primeira conta: " + primeiraConta.agencia);
		System.out.println("N�mero da primeira conta: " + primeiraConta.numero);
		
		System.out.println("Ag�ncia da segunda conta: " + segundaConta.agencia);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta na ag�ncia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		}
		else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
