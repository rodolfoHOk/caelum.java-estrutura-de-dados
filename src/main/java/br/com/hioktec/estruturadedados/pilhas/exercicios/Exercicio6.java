package br.com.hioktec.estruturadedados.pilhas.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Exercicio6 {
	public static void main(String[] args) {
		String mensagem = "Uma mensagem confidencial";
		String criptografada = "amU megasnem laicnedifnoc";
		
		String mensagemCriptografada = criptografar(mensagem);
		System.out.println("Mensagem criptografada: " + mensagemCriptografada);
		System.out.println("Mensagem criptografada corretamente: " + mensagemCriptografada.equals(criptografada));
		
		String mensagemDescriptografada = descriptografar(mensagemCriptografada);
		System.out.println("Mensagem descriptografada: " + mensagemDescriptografada);
		System.out.println("Mensagem descriptografada corretamente: " + mensagemDescriptografada.equals(mensagem));
	}
	
	static String criptografar(String mensagem) {
		List<String> palavras = Arrays.asList(mensagem.split(" "));
		
		List<String> palavrasCriptografadas = palavras.stream()
				.map(palavra -> inverterPalavra(palavra))
				.collect(Collectors.toList());
		
		return String.join(" ", palavrasCriptografadas);
	}
	
	static String descriptografar(String mensaegemCriptografada) {	
		return criptografar(mensaegemCriptografada);
	}
	
	static String inverterPalavra(String palavra) {
		Stack<Character> pilha = new Stack<Character>();
		
		for (int i = 0; i < palavra.length(); i++) {
			pilha.push(palavra.charAt(i));
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < palavra.length(); i++) {
			builder.append(pilha.pop());
		}
		return builder.toString();
	}
}
