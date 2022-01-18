
public class TestaIR {
	public static void main(String[] args) {
		double salario = 3300.0;
		
		if (salario >= 1900.00 && salario <= 2800.00) {
			System.out.println("O IR é 7.5%");
			System.out.println("Pode deduzir na declaração R$142");
		}
		else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("O IR é 15%");
			System.out.println("Pode deduzir na declaração R$350");
		}
		else if (salario >= 3751.01 && salario <= 4661.00) {
			System.out.println("O IR é 22.5%");
			System.out.println("Pode deduzir na declaração R$636");
		}
	}
}
