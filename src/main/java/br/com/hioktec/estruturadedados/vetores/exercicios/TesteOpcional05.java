package br.com.hioktec.estruturadedados.vetores.exercicios;

import br.com.hioktec.estruturadedados.representacoes.Aluno;

public class TesteOpcional05 {
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
		alunos.adiciona(paulo);
		
		int indicePaulo = alunos.lastIndexOf(paulo);
		
		System.out.println(indicePaulo);
	}
}
