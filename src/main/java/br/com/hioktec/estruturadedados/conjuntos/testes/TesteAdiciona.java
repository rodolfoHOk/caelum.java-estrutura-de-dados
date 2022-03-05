package br.com.hioktec.estruturadedados.conjuntos.testes;

import java.util.List;

import br.com.hioktec.estruturadedados.conjuntos.ConjuntoEspalhamento;

public class TesteAdiciona {
	public static void main(String[] args) {
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<>();
		
		conjunto.adiciona("Rafael");
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		List<String> palavras = conjunto.pegaTodos();
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}
}
