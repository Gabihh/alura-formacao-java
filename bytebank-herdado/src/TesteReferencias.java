public class TesteReferencias {
	public static void main(String[] args) {
		//Funcionario g1 = new Gerente();
		Funcionario g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		
		String nome = g1.getNome();
		System.out.println(nome);
		
		Funcionario ev = new EditorVideo();
		ev.setSalario(2500);
		
		Funcionario d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
	}
}
