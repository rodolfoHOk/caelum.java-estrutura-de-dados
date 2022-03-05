package br.com.hioktec.estruturadedados.representacoes;

public class Carro {
	
	private String nome;
	private String marca;
	private String cor;
	private String ano;
	
	public Carro(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
