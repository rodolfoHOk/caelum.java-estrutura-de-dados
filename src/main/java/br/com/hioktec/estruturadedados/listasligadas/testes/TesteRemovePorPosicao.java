package br.com.hioktec.estruturadedados.listasligadas.testes;

import br.com.hioktec.estruturadedados.listasligadas.ListaLigada;

public class TesteRemovePorPosicao {
	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<String>();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		lista.adiciona("Camila");
		
		lista.remove(1);
		
		System.out.println(lista); // Saída esperada: [Rafael, Camila]
	}
}
