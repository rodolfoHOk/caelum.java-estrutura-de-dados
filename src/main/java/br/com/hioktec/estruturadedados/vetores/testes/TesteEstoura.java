package br.com.hioktec.estruturadedados.vetores.testes;

import br.com.hioktec.estruturadedados.representacao.Aluno;
import br.com.hioktec.estruturadedados.vetores.Vetor;

public class TesteEstoura {
	public static void main(String[] args) {
		Vetor<Aluno> vetor = new Vetor<Aluno>();
		
		for (int i = 0; i < 100001; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
	}
}
