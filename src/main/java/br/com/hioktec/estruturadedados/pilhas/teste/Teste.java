package br.com.hioktec.estruturadedados.pilhas.teste;

import br.com.hioktec.estruturadedados.pilhas.Pilha;
import br.com.hioktec.estruturadedados.representacao.Peca;

public class Teste {
	public static void main(String[] args) {
		Pilha<Peca> pilha = new Pilha<Peca>();
		
		Peca pecaInsere = new Peca();
		pecaInsere.setNome("peça1");
		pilha.insere(pecaInsere);
		
		Peca pecaRemove = pilha.remove();
		
		if (pecaInsere != pecaRemove) {
			System.out.println("Erro: a peça removida não é igual a que foi inserida");
		}
		
		if (!pilha.vazia()) {
			System.out.println("Erro: A pilha não está vazia");
		}
		
		Pilha<String> pilha2 = new Pilha<String>();
		pilha2.insere("Rafael Cosentino");
		pilha2.insere("Paulo Silveira");
		
		String paulo = pilha2.remove();
		String rafael = pilha2.remove();
		
		System.out.println(paulo); //  Paulo Silveira
		System.out.println(rafael); // Rafael Cosentino
	}
}
