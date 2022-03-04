package br.com.hioktec.estruturadedados.vetores;

import br.com.hioktec.estruturadedados.listasinterfaces.Lista;

public class Vetor<E> implements Lista<E>{

	@SuppressWarnings("unchecked")
	private E[] elementos = (E[]) new Object[100000];
	
	private int totalDeElementos = 0;
	
	// método 1 teste linear vs constante
//	public void adiciona(E elemento) { 
//		for (int i = 0; i < this.elementos.length; i++) {
//			if (this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				break;
//			}
//		}
//	}
	
	// método 2 teste linear vs constante
	public void adiciona(E elemento) { 
		garantaEspaco(); // passar no teste estoura
		this.elementos[totalDeElementos] = elemento;
		this.totalDeElementos++;
	}
	
	public void adiciona(int posicao, E elemento) {
		garantaEspaco(); // passar no teste estoura
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		for (int i = this.totalDeElementos - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.totalDeElementos++;
	}
	
	public E pega(int posicao) {
		if (!posicaoOcupada(posicao)) { // método 1 sem esta verificação
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		return this.elementos[posicao];
	}
	
	public void remove(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		for (int i = posicao; i < this.totalDeElementos - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		
		this.totalDeElementos--;
	}

	// método 1 teste de tempo do contem
//	public boolean contem(E elemento) {
//		for (int i = 0; i < this.elementos.length; i++) {
//			if (elemento.equals(elementos[i])) {
//				return true;
//			}
//		}
//		
//		return false;
//	}
	
	// método 2 teste de tempo do contem
	public boolean contem(E elemento) { 
		for (int i = 0; i < this.totalDeElementos; i++) {
			if (elemento.equals(elementos[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	public int tamanho() {
		return this.totalDeElementos;
	}
	
	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(this.elementos[i]);
			builder.append(", ");
		}
		
		builder.append(this.elementos[this.totalDeElementos - 1]);
		builder.append("]");
		
		return builder.toString();
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >=0 && posicao < this.totalDeElementos;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao <= this.totalDeElementos;
	}
	
	private void garantaEspaco() {
		if (this.totalDeElementos == this.elementos.length) {
			@SuppressWarnings("unchecked")
			E[] novaArray = (E[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				novaArray[i] = elementos[i];
			}
			this.elementos = novaArray;
		}
	}
}
