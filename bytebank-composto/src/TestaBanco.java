

public class TestaBanco {
	public static void main(String[] args) {
		Cliente clientePaulo = new Cliente();
		clientePaulo.nome = "Paulo Silveira";
		clientePaulo.cpf = "222.222.222-22";
		clientePaulo.profissao = "Programador";
		
		Conta contaPaulo = new Conta();
		contaPaulo.deposita(100);
		
		// Associa  o clientePaulo a contaPaulo
		contaPaulo.titular = clientePaulo;
		System.out.println(contaPaulo.titular.nome);
		System.out.println(contaPaulo.titular);
		System.out.println(clientePaulo);
		
	}
}
