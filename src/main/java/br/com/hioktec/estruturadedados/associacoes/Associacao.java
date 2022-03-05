package br.com.hioktec.estruturadedados.associacoes;

public class Associacao<K,V> {
	
	private K chave;
	private V valor;
	
	public Associacao(K chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public K getChave() {
		return chave;
	}

	public V getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "{" + this.chave + " -> " + this.valor + "}";
	}
}
