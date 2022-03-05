package br.com.hioktec.estruturadedados.vetores.testes;

import br.com.hioktec.estruturadedados.representacoes.Aluno;
import br.com.hioktec.estruturadedados.vetores.Vetor;

public class TesteContemAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor<Aluno> lista = new Vetor<Aluno>();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.contem(a1)); // saída esperada: true
		
		System.out.println(lista.contem(a2)); // saída esperada: true
		
		Aluno aluno = new Aluno();
		aluno.setNome("Ana");
		
		System.out.println(lista.contem(aluno)); // saída esperada: false
	}
}
