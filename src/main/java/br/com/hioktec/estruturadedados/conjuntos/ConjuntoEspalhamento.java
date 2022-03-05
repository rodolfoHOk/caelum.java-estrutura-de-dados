package br.com.hioktec.estruturadedados.conjuntos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.hioktec.estruturadedados.listasinterfaces.Conjunto;

public class ConjuntoEspalhamento<E> implements Conjunto<E> {
	
	private List<List<E>> tabela = new ArrayList<List<E>>();
	
	private int tamanho = 0;
	
	public ConjuntoEspalhamento() {
		for (int i = 0; i < 26; i++) {
			LinkedList<E> lista = new LinkedList<E>();
			tabela.add(lista);
		}
	}
	
	@Override
	public void adiciona(E elemento) {
		if (!this.contem(elemento)) {
			verificaCarga();
			int indice = this.calculaIndiceDaTabela(elemento);
			List<E> lista = this.tabela.get(indice);
			lista.add(elemento);
			this.tamanho++;
		}
	}

	@Override
	public void remove(E elemento) {
		if (this.contem(elemento)) {
			int indice = this.calculaIndiceDaTabela(elemento);
			List<E> lista = this.tabela.get(indice);
			lista.remove(elemento);
			this.tamanho--;
			verificaCarga();
		}		
	}

	@Override
	public boolean contem(E elemento) {
		int indice = this.calculaIndiceDaTabela(elemento);
		List<E> lista = this.tabela.get(indice);
		return lista.contains(elemento);
	}

	@Override
	public List<E> pegaTodos() {
		List<E> elementos = new ArrayList<E>();
		for (int i = 0; i < this.tabela.size(); i++) {
			elementos.addAll(this.tabela.get(i));
		}
		return elementos;
	}

	@Override
	public int tamanho() {
		return this.tamanho;
	}
	
	public void imprimeTabela() {
		for (List<E> lista : this.tabela) {
			System.out.print("[");
			for (int i = 0; i < lista.size(); i++) {
				System.out.print("*");
			}
			System.out.println("]");
		}
	}
	
	private int calculaIndiceDaTabela(E elemento) {
//		return palavra.toLowerCase().charAt(0) % 26; // implementação antiga: espalhamento ruim
//		int codigoDeEspalhamento = this.calculaCodigoDeEspalhamento(palavra); // implementação nova: espalhamento informe
		int codigoDeEspalhamento = elemento.hashCode(); // na generalização: gerar codigo de espalhamento agora é de competência do objeto
		codigoDeEspalhamento = Math.abs(codigoDeEspalhamento);
		return codigoDeEspalhamento % this.tabela.size();
	}
	
	// na generalização: gerar codigo de espalhamento agora é de competência do objeto
//	private int calculaCodigoDeEspalhamento(String palavra) {
//		int codigo = 1;
//		for (int i = 0; i < palavra.length(); i++) {
//			codigo = 31 * codigo + palavra.charAt(i);
//		}
//		return codigo;
//	}
	
	private void redimensionaTabela(int novaCapacidade) {
		List<E> elementos = this.pegaTodos();
		this.tabela.clear();
		
		for (int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<E>());
		}
		
		for (E elemento : elementos) {
			int indice = this.calculaIndiceDaTabela(elemento);
			List<E> lista = this.tabela.get(indice);
			lista.add(elemento);
		};
	}
	
	private void verificaCarga() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;
		
		if (carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}
}
