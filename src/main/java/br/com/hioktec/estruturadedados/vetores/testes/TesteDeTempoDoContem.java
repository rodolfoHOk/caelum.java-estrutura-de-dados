package br.com.hioktec.estruturadedados.vetores.testes;

import br.com.hioktec.estruturadedados.representacoes.Aluno;
import br.com.hioktec.estruturadedados.vetores.Vetor;

public class TesteDeTempoDoContem {
	public static void main(String[] args) {
		Vetor<Aluno> vetor = new Vetor<Aluno>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 1; i < 30000; i++) {
			Aluno aluno = new Aluno();
			aluno.setNome("aluno" + i);
			vetor.adiciona(aluno);
			if (!vetor.contem(aluno)) {
				System.out.println("Erro: aluno " + aluno + " não foi adicionado.");
			}
		}
		
		for (int i = 1; i < 30000; i++) {
			Aluno aluno = new Aluno();
			if (vetor.contem(aluno)) {
				System.out.println("Erro: aluno " + aluno + " foi adicionado.");
			}
		}
		
		long fim = System.currentTimeMillis();
		
		double tempo = (fim - inicio) / 1000.0;
		System.out.println("Tempo em segundos = " + tempo);
	}
}

// resultado do método 1: 17.481
// resultado do método 2: 11.158
