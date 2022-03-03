package br.com.hioktec.estruturadedados.listasligadas;

import br.com.hioktec.estruturadedados.lista.ListaLigadaInterface;

public class ListaLigada<E> implements ListaLigadaInterface<E>{
	
	private Celula primeira;
	
	private Celula ultima;
	
	private int totalDeElementos;

	public void adiciona(E elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProxima(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.totalDeElementos++;
		}
	}

	public void adiciona(int posicao, E elemento) {
		if (posicao == 0) {
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) {
			this.adiciona(elemento);
		} else {
			Celula anterior = this.getCelula(posicao - 1);
			Celula proxima = anterior.getProxima();
			Celula nova = new Celula(anterior.getProxima(), elemento);
			nova.setAnterior(anterior);
			anterior.setProxima(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;
		}
	}

	@SuppressWarnings("unchecked")
	public E pega(int posicao) {
		return (E) this.getCelula(posicao).getElemento();
	}

	public void remove(int posicao) {
		// TODO Auto-generated method stub
		
	}

	public boolean contem(E elemento) {
		// TODO Auto-generated method stub
		return false;
	}

	public int tamanho() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void adicionaNoComeco(E elemento) {
		if (this.totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.totalDeElementos++;		
	}

	public void removeDoComeco() {
		if (!this.posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		
		if (this.totalDeElementos == 0) {
			this.ultima = null;
		} else {
			this.primeira.setAnterior(null);
		}
	}

	public void removeDoFim() {
		if (!this.posicaoOcupada(totalDeElementos - 1)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		
		if (this.totalDeElementos == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProxima(null);
			this.ultima = penultima;
			this.totalDeElementos--;
		}
		
	}

	@Override
	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = this.primeira;
		
		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos; 
	}
	
	private Celula getCelula(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		
		Celula atual = primeira;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		
		return atual;
	}
}
