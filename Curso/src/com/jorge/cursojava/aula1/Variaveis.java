package com.jorge.cursojava.aula1;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java
		int idade = 20;
		String nome = "Jonas";
		String nomeDoMeuCachorro = "Hulk";
		String ano = "2024";
		
		//aceito, mas não utilizado
		int _idade;
		int $idade;
		
		//não é aceito 
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// má pratica
		int a = 10;
		String b = "jonas";

	}

}
