package br.com.hioktec.estruturadedados.associacoes;

import br.com.hioktec.estruturadedados.representacoes.Carro;

public class AssociacaoPlacaCarro {

	private String placa;
	private Carro carro;
	
	public AssociacaoPlacaCarro(String placa, Carro carro) {
		super();
		this.placa = placa;
		this.carro = carro;
	}

	public String getPlaca() {
		return placa;
	}

	public Carro getCarro() {
		return carro;
	}
}
