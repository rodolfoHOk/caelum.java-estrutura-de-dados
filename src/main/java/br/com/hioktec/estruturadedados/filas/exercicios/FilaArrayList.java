package br.com.hioktec.estruturadedados.filas.exercicios;

import java.util.ArrayList;

import br.com.hioktec.estruturadedados.listasinterfaces.FilaInterface;

public class FilaArrayList<E> implements FilaInterface<E>{

	private ArrayList<E> elementos = new ArrayList<E>();
	
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
