package br.com.hioktec.estruturadedados.conjuntos.testes;

import br.com.hioktec.estruturadedados.conjuntos.ConjuntoEspalhamento;

public class Teste {
	public static void main(String[] args) {
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<>();
		
		conjunto.adiciona("palavra");
		conjunto.adiciona("computador");
		conjunto.adiciona("apostila");
		conjunto.adiciona("instrutor");
		conjunto.adiciona("mesa");
		conjunto.adiciona("telefone");
		
		if (!conjunto.contem("apostila")) {
			System.out.println("Erro: não tem a palavra apostila");
		}
		
		conjunto.remove("apostila");
		
		if (conjunto.contem("apostila")) {
			System.out.println("Erro: tem a palavra apostila");
		}
		
		if(conjunto.tamanho() != 5) {
			System.out.println("Erro: tamanho do conjunto deveria ser 5");
		}
	}
}
