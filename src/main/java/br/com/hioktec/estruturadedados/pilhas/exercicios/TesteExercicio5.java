package br.com.hioktec.estruturadedados.pilhas.exercicios;

import br.com.hioktec.estruturadedados.representacoes.Peca;

public class TesteExercicio5 {
	public static void main(String[] args) {
		PilhaArrayList<Peca> pilha = new PilhaArrayList<Peca>();
		
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
		
		PilhaArrayList<String> pilha2 = new PilhaArrayList<String>();
		pilha2.insere("Rafael Cosentino");
		pilha2.insere("Paulo Silveira");
		
		String paulo = pilha2.remove();
		String rafael = pilha2.remove();
		
		System.out.println(paulo); //  Paulo Silveira
		System.out.println(rafael); // Rafael Cosentino
		
		// não teremos ganho nem perda de tempo em nenhuma operação pois estamos empilhando no fim da lista,
		// se fosse no começo ai sim teríamos perda de tempo significativo quanto mais extensa fosse a pilha.
	}
}
