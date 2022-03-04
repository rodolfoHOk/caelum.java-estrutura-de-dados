package br.com.hioktec.estruturadedados.listasinterfaces;

public interface PilhaInterface<E> {
	
	void insere(E elemento);
	
	E remove();
	
	boolean vazia();
}
