package br.com.hioktec.estruturadedados.filas.testes;

import br.com.hioktec.estruturadedados.filas.Fila;
import br.com.hioktec.estruturadedados.representacoes.Aluno;

public class Teste {
	public static void main(String[] args) {
		Fila<Aluno> filaAluno = new Fila<Aluno>();
		
		Aluno aluno = new Aluno();
		filaAluno.insere(aluno);
		
		Aluno alunoRemovido = filaAluno.remove();
		if (!alunoRemovido.equals(aluno)) {
			System.out.println("Erro: o aluno removido não é o mesmo inserido");
		}
		
		if (!filaAluno.vazia()) {
			System.out.println("Erro: a fila não está vazia");
		}
		
		Fila<String> filaString = new Fila<String>();
		
		filaString.insere("Rafael Cosentino");
		filaString.insere("Paulo Silveira");
		
		String rafael = filaString.remove();
		String paulo = filaString.remove();
		
		System.out.println(rafael); // Rafael Cosentino
		System.out.println(paulo); //  Paulo Silveira
	}
}
