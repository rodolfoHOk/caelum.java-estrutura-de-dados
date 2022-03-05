package br.com.hioktec.estruturadedados.listasinterfaces;

public interface Mapa<K,V> {

	void adiciona (K chave, V valor);
	
	V pega (K chave);
	
	void remove (K chave);
	
	boolean contemChave (K chave);
	
	int tamanho();
}
