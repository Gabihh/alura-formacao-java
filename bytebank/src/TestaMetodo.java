

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.deposita(50);
		System.out.println(contaPaulo.saldo);
		
		boolean consegiuRetirar = contaPaulo.saca(20);
		System.out.println(contaPaulo.saldo);
		System.out.println(consegiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		System.out.println(contaMarcela.saldo);
		System.out.println(contaPaulo.saldo);
		
		boolean sucessoTransferencia = contaMarcela.transfere(300, contaPaulo);
		if(sucessoTransferencia) {
			System.out.println("Transferência com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println(contaMarcela.saldo);
		System.out.println(contaPaulo.saldo);
		
		contaPaulo.titular = "Paulo Silveira";
		System.out.println(contaPaulo.titular);
	}
}
