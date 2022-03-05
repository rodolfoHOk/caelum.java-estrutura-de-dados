package br.com.hioktec.estruturadedados.vetores.testes;

import java.util.ArrayList;

import br.com.hioktec.estruturadedados.representacoes.Aluno;

public class TesteJavaArrayList {
	public static void main(String[] args) {
		
		ArrayList<Aluno> vetor = new ArrayList<Aluno>();
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		
		aluno1.setNome("Rafael");
		aluno2.setNome("Paulo");
		aluno3.setNome("Ana");
		
		vetor.add(aluno1);
		vetor.add(aluno2);
		vetor.add(0, aluno3);
		
		int tamanho = vetor.size();
		
		if (tamanho != 3) {
			System.out.println("Erro: O tamanho da lista está errada");
		}
		
		if (!vetor.contains(aluno1)) {
			System.out.println("Erro: Não achou o aluno que deveria estar na lista");
		}
		
		vetor.remove(0);
		tamanho = vetor.size();
		
		if (tamanho != 2) {
			System.out.println("Erro: O tamanho da lista está errada");
		}
		
		if (vetor.contains(aluno3)) {
			System.out.println("Erro: Achou um aluno que não deveria estar na lista");
		}
		
		Aluno a1 = vetor.get(1);
		
		System.out.println(a1); // saída esperada: Paulo
	}
}
