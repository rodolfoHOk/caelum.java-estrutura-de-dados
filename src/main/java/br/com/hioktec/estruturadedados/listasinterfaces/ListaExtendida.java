package br.com.hioktec.estruturadedados.listasinterfaces;

public interface ListaExtendida<E> extends Lista<E>{
	
	void remove(E elemento);
	
	void clear();
	
	int indexOf(E elemento);
	
	int lastIndexOf(E elemento);
}
