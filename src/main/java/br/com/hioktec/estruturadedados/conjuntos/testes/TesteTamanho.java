package br.com.hioktec.estruturadedados.conjuntos.testes;

import br.com.hioktec.estruturadedados.conjuntos.ConjuntoEspalhamento;

public class TesteTamanho {
	public static void main(String[] args) {
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<>();
		
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		
		System.out.println(conjunto.tamanho()); // 2
		
		conjunto.adiciona("Paulo");
		
		System.out.println(conjunto.tamanho()); // 3
	}
}
