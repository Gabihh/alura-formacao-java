import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestaLacos2 {
	public static void main(String[] args) {
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna <= linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Multiplos de 3");
		for (int numero = 1; numero <= 100; numero++) {
			if (numero % 3 == 0) {
				System.out.print(numero + " ");
			}
		}
		
		System.out.println();
		//outro forma de fazer o mesmo processo
		for (int numero = 3; numero < 100; numero += 3) {
			if (numero % 3 == 0) {
				System.out.print(numero + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Fatorial de 1 a 10");
		int fatorial = 1;
		for (int n = 1; n <= 10; n++) {
			fatorial *= n;
			System.out.println("Fatorial de " + n + " = " + fatorial);
		}
	}
}
