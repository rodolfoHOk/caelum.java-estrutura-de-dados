package br.com.hioktec.estruturadedados.filas.exercicios;

import br.com.hioktec.estruturadedados.filas.Fila;
import br.com.hioktec.estruturadedados.representacoes.Aluno;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Fila<Aluno> alunos = new Fila<>();
		
		Long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 30000; i++) {
			Aluno aluno = new Aluno();
			alunos.insere(aluno);
		}
		
		for (int i = 0; i < 30000; i++) {
			alunos.remove();
		}
		
		Long fim = System.currentTimeMillis();
		
		System.out.println("Performance da fila com LinkedList em segundos: " + (fim - inicio)/1000.0);
		
		FilaArrayList<Aluno> alunos2 = new FilaArrayList<>();
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			Aluno aluno = new Aluno();
			alunos2.insere(aluno);
		}
		
		for (int i = 0; i < 100000; i++) {
			alunos2.remove();
		}
		
		fim = System.currentTimeMillis();
		
		System.out.println("Performance da fila com ArrayList em segundos: " + (fim - inicio)/1000.0);
		
		// com LinkedList: 0.017s
		// com ArrayList: 6.186s
	}
}
