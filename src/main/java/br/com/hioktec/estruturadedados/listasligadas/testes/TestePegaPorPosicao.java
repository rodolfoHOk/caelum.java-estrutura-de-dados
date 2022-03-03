package br.com.hioktec.estruturadedados.listasligadas.testes;

import br.com.hioktec.estruturadedados.listasligadas.ListaLigada;

public class TestePegaPorPosicao {
	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<String>();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		
		System.out.println(lista.pega(0)); // Saída esperada: Rafael
		System.out.println(lista.pega(1)); // Saída esperada: Paulo
	}
}
