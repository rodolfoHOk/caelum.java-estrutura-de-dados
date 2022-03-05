package br.com.hioktec.estruturadedados.conjuntos.testes;

import br.com.hioktec.estruturadedados.conjuntos.ConjuntoEspalhamento;

public class TesteContem {
	public static void main(String[] args) {
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<>();
		
		conjunto.adiciona("Ana");
		conjunto.adiciona("Paulo");
		
		System.out.println("Contém Ana: " + conjunto.contem("Ana")); // Contém Ana: true
		System.out.println("Contém Paulo: " + conjunto.contem("Paulo")); // Contém Paulo: true 
		System.out.println("Contém Rafael: " + conjunto.contem("Rafael")); // Contém Rafael: false 
	}
}
