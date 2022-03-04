package br.com.hioktec.estruturadedados.pilhas;

import java.util.LinkedList;
import java.util.List;

import br.com.hioktec.estruturadedados.listasinterfaces.PilhaInterface;

public class Pilha<E> implements PilhaInterface<E> {
	
	private List<E> elementos = new LinkedList<E>();

	public void insere(E elemento) {
		this.elementos.add(elemento);		
	}

	public E remove() {
		return this.elementos.remove(this.elementos.size() - 1);
	}

	public boolean vazia() {
		return this.elementos.size() == 0;
	}

}
