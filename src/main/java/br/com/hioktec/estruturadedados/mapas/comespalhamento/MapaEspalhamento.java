package br.com.hioktec.estruturadedados.mapas.comespalhamento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.hioktec.estruturadedados.associacoes.Associacao;
import br.com.hioktec.estruturadedados.listasinterfaces.Mapa;

public class MapaEspalhamento<K,V> implements Mapa<K, V> {
	
	private List<List<Associacao<K, V>>> tabela = new ArrayList<List<Associacao<K, V>>>();
	
	private int tamanho = 0;
	
	public MapaEspalhamento() {
		for (int i = 0; i < 100; i++) {
			this.tabela.add(new LinkedList<Associacao<K, V>>());
		}
	}

	@Override
	public void adiciona(K chave, V valor) {
		if (this.contemChave(chave)) {
			this.remove(chave);
		}
		verificaCarga();
		
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<K, V>> lista = this.tabela.get(indice);
		lista.add(new Associacao<K,V>(chave, valor));
		this.tamanho++;
	}

	@Override
	public V pega(K chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<K, V>> lista = this.tabela.get(indice);
		
		for (int i = 0; i < lista.size(); i++) {
			Associacao<K, V> associacao = lista.get(i);
			if (associacao.getChave().equals(chave)) {
				return associacao.getValor();
			}
		}
		throw new IllegalArgumentException("A chave não existe");	
	}

	@Override
	public void remove(K chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<K, V>> lista = this.tabela.get(indice);
		
		for (int i = 0; i < lista.size(); i++) {
			Associacao<K, V> associacao = lista.get(i);
			if (associacao.getChave().equals(chave)) {
				lista.remove(i);
				this.tamanho--;
//				verificaCarga();
				return;
			}
		}
		throw new IllegalArgumentException("A chave não existe");
	}

	@Override
	public boolean contemChave(K chave) {
		int indice = this.calculaIndiceDaTabela(chave);
		List<Associacao<K, V>> lista = this.tabela.get(indice);
		
		for (int i = 0; i < lista.size(); i++) {
			Associacao<K, V> associacao = lista.get(i);
			if (associacao.getChave().equals(chave)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int tamanho() {
		return this.tamanho;
	}
	
	public List<Associacao<K, V>> pegaTodas() {
		ArrayList<Associacao<K, V>> associacoes = new ArrayList<Associacao<K, V>>();
		for (List<Associacao<K, V>> lista : this.tabela) {
			associacoes.addAll(lista);
		}
		return associacoes;
	}
	
	@Override
	public String toString() {
		return this.pegaTodas().toString();
	}
	
	private int calculaIndiceDaTabela(K chave) {
		return Math.abs(chave.hashCode() % this.tabela.size());
	}
	
	private void redimensionaTabela(int novaCapacidade) {
		ArrayList<Associacao<K, V>> associacoes = (ArrayList<Associacao<K, V>>) this.pegaTodas();
		this.tabela.clear();
		
		for (int i = 0; i < novaCapacidade; i++) {
			this.tabela.add(new LinkedList<Associacao<K, V>>());
		}
		
		for (Associacao<K, V> associacao : associacoes) {
			int indice = this.calculaIndiceDaTabela(associacao.getChave());
			List<Associacao<K, V>> lista = this.tabela.get(indice);
			lista.add(new Associacao<K,V>(associacao.getChave(), associacao.getValor()));
		}
	}
	
	private void verificaCarga() {
		int capacidade = this.tabela.size();
		double carga = (double) this.tamanho / capacidade;
		
		if (carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		} else if (carga < 0.25 && capacidade >= 10) {
			this.redimensionaTabela(Math.max(capacidade / 2, 10));
		}
	}
}
