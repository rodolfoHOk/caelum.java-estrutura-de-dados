package br.com.hioktec.estruturadedados.vetores.testes;

import br.com.hioktec.estruturadedados.representacoes.Aluno;
import br.com.hioktec.estruturadedados.vetores.Vetor;

public class TesteLinearVsConstante {
	public static void main(String[] args) {
		Vetor<Aluno> vetor = new Vetor<Aluno>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 1; i < 100000; i++) {
			Aluno aluno = new Aluno();
			vetor.adiciona(aluno);
		}
		
		long fim = System.currentTimeMillis();
		
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo em segundos = " + tempo);
	}
}

// resultado método 1 : 3.935
// resultado método 2 : 0.011
