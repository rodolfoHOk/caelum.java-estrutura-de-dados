package br.com.hioktec.estruturadedados.vetores.testes;

import br.com.hioktec.estruturadedados.representacao.Aluno;
import br.com.hioktec.estruturadedados.vetores.Vetor;

public class TesteRemovePorPosicao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor<Aluno> lista = new Vetor<Aluno>();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		lista.remove(0);
		
		System.out.println(lista); // saída esperada: [Paulo]
	}
}
