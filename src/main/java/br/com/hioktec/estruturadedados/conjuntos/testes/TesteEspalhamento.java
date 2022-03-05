package br.com.hioktec.estruturadedados.conjuntos.testes;

import br.com.hioktec.estruturadedados.conjuntos.ConjuntoEspalhamento;

public class TesteEspalhamento {
	public static void main(String[] args) {
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<>();
		
		for (int i = 0; i < 100; i++) {
			conjunto.adiciona("palavra" + i);
		}
		
		conjunto.imprimeTabela();
	}
}
