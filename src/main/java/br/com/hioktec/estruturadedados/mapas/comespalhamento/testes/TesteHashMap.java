package br.com.hioktec.estruturadedados.mapas.comespalhamento.testes;

import java.util.HashMap;

import br.com.hioktec.estruturadedados.representacoes.Carro;

public class TesteHashMap {
	public static void main(String[] args) {
		
		HashMap<String, Carro> mapa = new HashMap<>();
		
		mapa.put("abc1234", new Carro("a"));
		System.out.println(mapa);
		
		mapa.put("abc1235", new Carro("b"));
		System.out.println(mapa);
		
		mapa.put("abc1234", new Carro("c"));
		System.out.println(mapa);
		
		System.out.println(mapa.containsKey("abc1235"));
		
		System.out.println(mapa.get("abc1235"));
		
		mapa.remove("abc1235");
		System.out.println(mapa);
	}
}
