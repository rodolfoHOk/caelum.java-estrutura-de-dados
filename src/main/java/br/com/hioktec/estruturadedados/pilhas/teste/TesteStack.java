package br.com.hioktec.estruturadedados.pilhas.teste;

import java.util.Stack;

import br.com.hioktec.estruturadedados.representacoes.Peca;

public class TesteStack {
	public static void main(String[] args) {
		
		Stack<Peca> pilha = new Stack<Peca>();
		
		Peca pecaInsere = new Peca();
		pecaInsere.setNome("peça1");
		pilha.push(pecaInsere);
		
		Peca pecaRemove = pilha.pop();
		System.out.println(pecaRemove); // peça1
		
		if (pilha.isEmpty()) {
			System.out.println("A pilha está vazia"); // A pilha está vazia
		}
	}
}
