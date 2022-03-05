package br.com.hioktec.estruturadedados.conjuntos.testes;

import br.com.hioktec.estruturadedados.conjuntos.ConjuntoEspalhamento;

public class TesteDesempenho {
	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();
		
		ConjuntoEspalhamento<String> conjunto = new ConjuntoEspalhamento<>();
		
		for (int i = 0; i < 50000; i++) {
			conjunto.adiciona("palavra" + i);
		}
		
		for (int i = 0; i < 50000; i++) {
			conjunto.contem("palavra" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Desempenho em segundos: " + (fim - inicio)/1000.0);
		
		// sem redimensionamento: 2.21
		// com redimensionamento: 0.264
	}
}
