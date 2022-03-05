package br.com.hioktec.estruturadedados.mapas.comespalhamento.testes;

import br.com.hioktec.estruturadedados.mapas.comespalhamento.MapaEspalhamento;
import br.com.hioktec.estruturadedados.representacoes.Carro;

public class TesteTempoMapaEspalhamento {
	public static void main(String[] args) {
		MapaEspalhamento<String, Carro> mapaEspalhamento = new MapaEspalhamento<>();
		int numeroDeElementos = 15000;
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < numeroDeElementos; i++) {
			mapaEspalhamento.adiciona("placa" + i, new Carro("carro" + i));
		}
		
		for (int i = 0; i < numeroDeElementos; i++) {
			mapaEspalhamento.pega("placa" + i);
		}
		
		for (int i = 0; i < numeroDeElementos; i++) {
			mapaEspalhamento.contemChave("placa" + i);
		}

		for (int i = 0; i < numeroDeElementos; i++) {
			mapaEspalhamento.remove("placa" + i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("Tempo: " + (fim - inicio)/1000.0);
		
		// Resultado: Tempo: 0.178
	}
}
