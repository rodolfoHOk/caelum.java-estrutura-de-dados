package br.com.hioktec.estruturadedados.vetores.exercicios;

import java.util.ArrayList;

import br.com.hioktec.estruturadedados.representacoes.Aluno;

public class Opcional01 {
	public static void main(String[] args) {
		
		ArrayList<String> vetor = new ArrayList<String>();
		
		vetor.add("Rafael");
		vetor.add("Paulo");
		
		Aluno ana = new Aluno();
		ana.setNome("Ana");
		
//		vetor.add(ana); // Erro de compilação
		
		System.out.println(vetor);
		
		String paulo = vetor.get(1); // não é necessário cast String
		
		System.out.println(paulo);
	}
}
