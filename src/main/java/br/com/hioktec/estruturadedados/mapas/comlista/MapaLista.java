package br.com.hioktec.estruturadedados.mapas.comlista;

import java.util.ArrayList;
import java.util.List;

import br.com.hioktec.estruturadedados.associacoes.Associacao;
import br.com.hioktec.estruturadedados.listasinterfaces.Mapa;

public class MapaLista<K, V> implements Mapa<K, V> {

	private List<Associacao<K, V>> associacoes = new ArrayList<Associacao<K, V>>();
	
	@Override
	public void adiciona(K chave, V valor) {
		if (!this.contemChave(chave)) {
			Associacao<K, V> associacao = new Associacao<K,V>(chave, valor);
			this.associacoes.add(associacao);
		}
	}

	@Override
	public V pega(K chave) {
		for (Associacao<K, V> associacao : this.associacoes) {
			if (chave.equals(associacao.getChave())) {
				return associacao.getValor();
			}
		}
		throw new IllegalArgumentException("chave não existe");
	}

	@Override
	public void remove(K chave) {
		if (this.contemChave(chave)) {
			for (int i = 0; i < this.associacoes.size(); i++) {
				Associacao<K, V> associacao = this.associacoes.get(i);
				
				if (chave.equals(associacao.getChave())) {
					this.associacoes.remove(i);
					break;
				}
			}
		} else {
			throw new IllegalArgumentException("chave não existe");
		}
	}

	@Override
	public boolean contemChave(K chave) {
		for (Associacao<K, V> associacao : this.associacoes) {
			if (chave.equals(associacao.getChave())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int tamanho() {
		return this.associacoes.size();
	}

}
