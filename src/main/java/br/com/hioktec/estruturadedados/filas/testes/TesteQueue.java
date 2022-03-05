package br.com.hioktec.estruturadedados.filas.testes;

import java.util.LinkedList;
import java.util.Queue;

import br.com.hioktec.estruturadedados.representacoes.Aluno;

public class TesteQueue {
	public static void main(String[] args) {
		
		Queue<Aluno> fila = new LinkedList<Aluno>();
		
		Aluno aluno = new Aluno();
		fila.offer(aluno);
		
		Aluno alunoRemovido = fila.poll();
		if (!alunoRemovido.equals(aluno)) {
			System.out.println("Erro: o aluno removido não é o mesmo inserido");
		}
		
		if (fila.isEmpty()) {
			System.out.println("A fila está vazia"); // A fila está vazia
		}
	}
}
