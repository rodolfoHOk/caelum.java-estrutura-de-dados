package br.com.hioktec.estruturadedados.listasligadas.testes;

import br.com.hioktec.estruturadedados.listasligadas.ListaLigada;

public class TesteAdicionaNoFim {
	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<String>();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		System.out.println(lista); // Saída esperada: [Rafael, Paulo]
	}
}
