package br.com.hioktec.estruturadedados.listasinterfaces;

import java.util.List;

public interface Conjunto<E> {
	
	void adiciona (E elemento);
	
	void remove (E elemento);
	
	boolean contem (E elemento);
	
	List<E> pegaTodos ();
	
	int tamanho();
}
