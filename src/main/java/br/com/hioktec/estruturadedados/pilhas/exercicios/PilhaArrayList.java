package br.com.hioktec.estruturadedados.pilhas.exercicios;

import java.util.ArrayList;
import java.util.List;

import br.com.hioktec.estruturadedados.listasinterfaces.PilhaInterface;

public class PilhaArrayList<E> implements PilhaInterface<E>{
	
	private List<E> elementos = new ArrayList<E>();

	public void insere(E elemento) {
		this.elementos.add(elemento);	
	}

	public E remove() {
		return this.elementos.remove(this.elementos.size() - 1);
	}

	public boolean vazia() {
		return this.elementos.isEmpty();
	}

}
