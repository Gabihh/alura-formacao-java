package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");//será adicionado apenas uma vez
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		alunos.forEach(aluno -> System.out.println(aluno));
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		boolean adicionou = alunos.add("Alberto Souza");
		alunos.remove("Sergio Lopes");
		
		System.out.println("Possui o aluno Paulo Silveira? " + pauloEstaMatriculado);
		System.out.println("Alberto Souza foi adicinado a lista novamente? " + adicionou);
		System.out.println(alunos.size());
	}
}
