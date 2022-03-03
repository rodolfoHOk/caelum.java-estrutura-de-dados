package br.com.hioktec.estruturadedados.vetores.utilizando;

import java.util.ArrayList;
import java.util.Vector;

import br.com.hioktec.estruturadedados.representacao.Aluno;
import br.com.hioktec.estruturadedados.vetores.Vetor;

public class VetoresExercicio12 {
	
	public static void main(String[] args) {
		
		Vetor<Aluno> vetor = new Vetor<Aluno>();
		
		System.out.println(vetor.tamanho());
		
		for (int i = 0; i < 1000; i++) {
			Aluno aluno = new Aluno();
			aluno.setNome("Aluno" + i);
			vetor.adiciona(aluno);
		}
		
		System.out.println(vetor.tamanho());
		
		Vector<Aluno> vector = new Vector<Aluno>();
		
		System.out.println(vector.size());
		
		for (int i = 0; i < 1000; i++) {
			vector.add(vetor.pega(i));
		}
		
		System.out.println(vector.size());
		
		ArrayList<Aluno> arraylist = new ArrayList<Aluno>();
		
		System.out.println(arraylist.size());

		for (int i = 0; i < 1000; i++) {
			arraylist.add(vector.get(i));
		}
		
		System.out.println(arraylist.size());
	}

}
