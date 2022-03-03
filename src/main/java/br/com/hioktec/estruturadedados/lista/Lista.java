package br.com.hioktec.estruturadedados.lista;

public interface Lista<E> {
	
	void adiciona(E elemento);
	
	public void adiciona(int posicao, E elemento);
	
	E pega(int posicao);
	
	void remove(int posicao);
	
	boolean contem(E elemento);
	
	int tamanho();
	
	String toString();
}
