public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta.numero = 1337;
		// conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		// conta.titular = paulo;
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
		// agora em duas linhas
		Cliente titularConta = conta.getTitular();
		titularConta.setCpf("111.111.111-11");
		System.out.println(conta.getTitular().getCpf());
		
		System.out.println(titularConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
