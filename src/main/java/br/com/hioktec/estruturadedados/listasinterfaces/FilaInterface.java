package br.com.hioktec.estruturadedados.listasinterfaces;

public interface FilaInterface<E> {

	void insere(E elemento);
	
	E remove();
	
	boolean vazia();
}
