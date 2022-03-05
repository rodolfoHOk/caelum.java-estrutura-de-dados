package br.com.hioktec.estruturadedados.listasligadas.testes;

import java.util.LinkedList;

import br.com.hioktec.estruturadedados.representacoes.Aluno;

public class TesteLinkedList {
	public static void main(String[] args) {
		Aluno paulo = new Aluno();
		paulo.setNome("Paulo Silveira");
		
		Aluno rafael = new Aluno();
		rafael.setNome("Rafael Cosentino");
		
		Aluno fiodor = new Aluno();
		fiodor.setNome("Fiodor Dostoievski");
		
		LinkedList<Aluno> listaLigada = new LinkedList<Aluno>();
		
		listaLigada.add(paulo);
		listaLigada.add(rafael);
		listaLigada.add(1, fiodor);
		
		for (int i = 0; i < listaLigada.size(); i++) {
			System.out.println(listaLigada.get(i));
		}
	}
}
