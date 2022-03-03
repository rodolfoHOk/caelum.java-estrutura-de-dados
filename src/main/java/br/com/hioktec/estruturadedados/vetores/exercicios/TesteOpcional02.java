package br.com.hioktec.estruturadedados.vetores.exercicios;

import br.com.hioktec.estruturadedados.representacao.Aluno;

public class TesteOpcional02 {
	public static void main(String[] args) {
		VetorExtendido<Aluno> alunos = new VetorExtendido<Aluno>();
		
		Aluno rafael = new Aluno();
		Aluno paulo = new Aluno();
		Aluno ana = new Aluno();
		
		rafael.setNome("Rafael");
		paulo.setNome("Paulo");
		ana.setNome("Ana");
		
		alunos.adiciona(rafael);
		alunos.adiciona(paulo);
		alunos.adiciona(ana);
		
		System.out.println(alunos);
		
		alunos.remove(paulo);
		
		System.out.println(alunos);		
	}
}
