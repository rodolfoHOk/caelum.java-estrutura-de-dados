package br.com.hioktec.estruturadedados.listasinterfaces;

public interface ListaLigadaInterface<E> extends Lista<E> {
	
	void adicionaNoComeco(E elemento);
	
	void removeDoComeco();
	
	void removeDoFim();
	
}
