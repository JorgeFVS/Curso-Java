package com.jorge.cursojava.aula12;

public class mainContador {
	
	static void imprimirValor() {
		System.out.println(Contador.getNumero());
	}

	public static void main(String[] args) {
		
		Contador.incrementar();
		imprimirValor();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.zerar();
		imprimirValor();
		
		Contador contador1 = new Contador();
		Contador contador2 = new Contador();
		Contador contador3 = new Contador();
		Contador contador4 = new Contador();
		
		imprimirValor();

	}

}
