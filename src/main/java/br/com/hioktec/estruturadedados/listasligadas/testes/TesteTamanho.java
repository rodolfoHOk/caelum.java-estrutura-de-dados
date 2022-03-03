package br.com.hioktec.estruturadedados.listasligadas.testes;

import br.com.hioktec.estruturadedados.listasligadas.ListaLigada;

public class TesteTamanho {
	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<String>();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		System.out.println(lista.tamanho()); // Saída esperada: 2
		
		lista.adiciona("Camila");
		
		System.out.println(lista.tamanho()); // Saída esperada: 3
	}
}
