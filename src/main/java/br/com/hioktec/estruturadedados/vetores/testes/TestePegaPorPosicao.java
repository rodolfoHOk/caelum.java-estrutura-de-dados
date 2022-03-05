package br.com.hioktec.estruturadedados.vetores.testes;

import br.com.hioktec.estruturadedados.representacoes.Aluno;
import br.com.hioktec.estruturadedados.vetores.Vetor;

public class TestePegaPorPosicao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		
		Vetor<Aluno> lista = new Vetor<Aluno>();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		Aluno aluno1 = lista.pega(0);
		Aluno aluno2 = lista.pega(1);
//		Aluno aluno3 = lista.pega(1000); // saída esperada: IllegalArgumentException: Posição Inválida / obs: método 1 ok
//		Aluno aluno4 = lista.pega(1000000); // saída esperada: IllegalArgumentException: Posição Inválida / obs: método 1 ArrayIndexOutOfBoundsException
		
		System.out.println(aluno1); // saída esperada: Rafael
		System.out.println(aluno2); // saída esperada: Paulo
	}
}
