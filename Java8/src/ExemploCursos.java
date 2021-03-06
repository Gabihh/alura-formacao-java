import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}


public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		//cursos.sort(Comparator.comparingInt(c -> c.getAlunos())); - lambda
		cursos.sort(Comparator.comparing(Curso::getAlunos)); //reference
		
		OptionalDouble media = cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.mapToInt(Curso::getAlunos)
			.average();
		
//		System.out.println("A soma dos alunos das aulas que possuem mais de 100 alunos: " + sum);
		
		//atividades
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() > 50)
//			.forEach(c -> System.out.println(c.getNome()));
//		
//		Stream<String> nomes = cursos.stream()
//				.map(Curso::getNome);
//		
//		cursos.stream()
//		   .filter(c -> c.getAlunos() > 50)
//		   .map(Curso::getAlunos)
//		   .forEach(System.out::println);
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.findAny()
//			.ifPresent(c -> System.out.println(c.getNome()));
			
//			cursos.parallelStream()
//				.filter(c -> c.getAlunos() >= 100)
//				.collect(Collectors.toMap(
//						c -> c.getNome(), 
//						c -> c.getAlunos()))
//				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		
		//atividades
		
//		Optional<Curso> primeiro = cursos.stream()
//		   .filter(c -> c.getAlunos() > 50)
//		   .findFirst();
		
//		 OptionalDouble mediaCurso = cursos.stream()
//			.mapToInt(c -> c.getAlunos())
//			.average();
//		 
//		 System.out.println(mediaCurso);
		
		List<Curso> cursosFiltrados = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .collect(Collectors.toList());
		
		//cursos.forEach(c -> System.out.println(c.getNome()));

		
	}
	
}
