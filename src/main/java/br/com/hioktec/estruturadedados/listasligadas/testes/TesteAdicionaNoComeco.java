package br.com.hioktec.estruturadedados.listasligadas.testes;

import br.com.hioktec.estruturadedados.listasligadas.ListaLigada;

public class TesteAdicionaNoComeco {
	public static void main(String[] args) {
		ListaLigada<String> lista = new ListaLigada<String>();
		
		lista.adicionaNoComeco("Rafael");
		lista.adicionaNoComeco("Paulo");
		
		System.out.println(lista); // Saída esperada: [Paulo, Rafael]
	}
}
