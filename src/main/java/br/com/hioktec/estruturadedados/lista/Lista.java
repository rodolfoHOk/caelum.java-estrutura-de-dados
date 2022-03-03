package br.com.hioktec.estruturadedados.lista;

public interface Lista<T> {
	
	void adiciona(T obj);
	
	public void adiciona(int posicao, T obj);
	
	T pega(int posicao);
	
	void remove(int posicao);
	
	boolean contem(T obj);
	
	int tamanho();
	
	String toString();
}
