package br.com.hioktec.estruturadedados.vetores.testes;

import br.com.hioktec.estruturadedados.representacoes.Aluno;
import br.com.hioktec.estruturadedados.vetores.Vetor;

public class TesteTamanhoLista {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		a3.setNome("Ana");
		
		Vetor<Aluno> lista = new Vetor<Aluno>();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		
		System.out.println(lista.tamanho()); // saída esperada: 2
		
		lista.adiciona(a3);
		
		System.out.println(lista.tamanho()); // saída esperada: 3
	}
}
