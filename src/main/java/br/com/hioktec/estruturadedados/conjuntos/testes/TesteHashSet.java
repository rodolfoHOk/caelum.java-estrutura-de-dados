package br.com.hioktec.estruturadedados.conjuntos.testes;

import java.util.HashSet;

public class TesteHashSet {
	public static void main(String[] args) {
		HashSet<String> conjunto = new HashSet<String>();
		
		conjunto.add("Rafael");
		conjunto.add("Ana");
		conjunto.add("Rafael");
		conjunto.add("Paulo");
		
		System.out.println(conjunto);
		
		conjunto.remove("Ana");
		
		System.out.println(conjunto);
	}
}
