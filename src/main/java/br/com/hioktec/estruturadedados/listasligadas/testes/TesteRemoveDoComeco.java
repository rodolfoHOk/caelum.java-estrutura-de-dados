package br.com.hioktec.estruturadedados.listasligadas.testes;

import br.com.hioktec.estruturadedados.listasligadas.ListaLigada;

public class TesteRemoveDoComeco {
	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<String>();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		lista.removeDoComeco();
		
		System.out.println(lista); // Saída esperada: [Paulo]
	}
}
