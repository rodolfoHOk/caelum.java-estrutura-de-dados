package br.com.hioktec.estruturadedados.filas;

import java.util.LinkedList;
import java.util.List;

import br.com.hioktec.estruturadedados.listasinterfaces.FilaInterface;

public class Fila<E> implements FilaInterface<E> {
	
	private List<E> elementos = new LinkedList<E>(); 

	@Override
	public void insere(E elemento) {
		this.elementos.add(elemento);	
	}

	@Override
	public E remove() {
		return this.elementos.remove(0);
	}

	@Override
	public boolean vazia() {
		return this.elementos.size() == 0;
	}
}
