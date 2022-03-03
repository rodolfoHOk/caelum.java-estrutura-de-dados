package br.com.hioktec.estruturadedados.vetores;

import br.com.hioktec.estruturadedados.lista.Lista;

public class Vetor<E> implements Lista<E>{

	private Object[] objetos = new Object[100000];
	
	private int totalDeObjetos = 0;
	
	// método 1 teste linear vs constante
//	public void adiciona(Object objeto) { 
//		for (int i = 0; i < this.objetos.length; i++) {
//			if (this.objetos[i] == null) {
//				this.objetos[i] = objeto;
//				break;
//			}
//		}
//	}
	
	// método 2 teste linear vs constante
	public void adiciona(Object objeto) { 
		garantaEspaco(); // passar no teste estoura
		this.objetos[totalDeObjetos] = objeto;
		this.totalDeObjetos++;
	}
	
	public void adiciona(int posicao, Object objeto) {
		garantaEspaco(); // passar no teste estoura
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
			this.objetos[i + 1] = this.objetos[i];
		}
		
		this.objetos[posicao] = objeto;
		this.totalDeObjetos++;
	}
	
	@SuppressWarnings("unchecked")
	public E pega(int posicao) {
		if (!posicaoOcupada(posicao)) { // método 1 sem esta verificação
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		return (E) this.objetos[posicao];
	}
	
	public void remove(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		for (int i = posicao; i < this.totalDeObjetos - 1; i++) {
			this.objetos[i] = this.objetos[i + 1];
		}
		
		this.totalDeObjetos--;
	}

	// método 1 teste de tempo do contem
//	public boolean contem(Object objeto) {
//		for (int i = 0; i < this.objetos.length; i++) {
//			if (objeto.equals(objetos[i])) {
//				return true;
//			}
//		}
//		
//		return false;
//	}
	
	// método 2 teste de tempo do contem
	public boolean contem(Object objeto) { 
		for (int i = 0; i < this.totalDeObjetos; i++) {
			if (objeto.equals(objetos[i])) {
				return true;
			}
		}
		
		return false;
	}
	
	public int tamanho() {
		return this.totalDeObjetos;
	}
	
	public String toString() {
		if (this.totalDeObjetos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < this.totalDeObjetos - 1; i++) {
			builder.append(this.objetos[i]);
			builder.append(", ");
		}
		
		builder.append(this.objetos[this.totalDeObjetos - 1]);
		builder.append("]");
		
		return builder.toString();
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >=0 && posicao < this.totalDeObjetos;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >=0 && posicao <= this.totalDeObjetos;
	}
	
	private void garantaEspaco() {
		if (this.totalDeObjetos == this.objetos.length) {
			Object[] novaArray = new Object[this.objetos.length * 2];
			for (int i = 0; i < this.objetos.length; i++) {
				novaArray[i] = objetos[i];
			}
			this.objetos = novaArray;
		}
	}
}
