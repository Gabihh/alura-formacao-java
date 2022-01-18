
public class FluxoComException {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecaoComException e) {
			String msg = e.getMessage();
			System.out.println("Exception " + msg);
			e.printStackTrace();
		}
		System.out.println("Fim do main");
	}
	
	private static void metodo1() throws MinhaExcecaoComException{
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	private static void metodo2() throws MinhaExcecaoComException{
		System.out.println("Inicio do metodo2");
		//Exceção checked
		throw new MinhaExcecaoComException("Deu muito errado");
		
		//System.out.println("Fim do metodo2");
	}
}

