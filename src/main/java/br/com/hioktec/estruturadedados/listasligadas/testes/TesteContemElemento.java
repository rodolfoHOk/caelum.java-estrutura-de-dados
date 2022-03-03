package br.com.hioktec.estruturadedados.listasligadas.testes;

import br.com.hioktec.estruturadedados.listasligadas.ListaLigada;

public class TesteContemElemento {
	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<String>();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		System.out.println(lista.contem("Rafael")); // Saída esperada: true
		System.out.println(lista.contem("Camila")); // Saída esperada: false
	}
}
