package br.com.hioktec.estruturadedados.mapas.comlista.testes;

import br.com.hioktec.estruturadedados.mapas.comlista.MapaLista;
import br.com.hioktec.estruturadedados.representacoes.Carro;

public class TesteTempoMapaLista {
	public static void main(String[] args) {
		MapaLista<String, Carro> mapaLista = new MapaLista<>();
		int numeroDeElementos = 15000;
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.adiciona("placa" + i, new Carro("carro" + i));
		}
		
		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.pega("placa" + i);
		}
		
		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.contemChave("placa" + i);
		}

		for (int i = 0; i < numeroDeElementos; i++) {
			mapaLista.remove("placa" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio)/1000.0);
		
		// Resultado: Tempo: 5.588
	}
}
