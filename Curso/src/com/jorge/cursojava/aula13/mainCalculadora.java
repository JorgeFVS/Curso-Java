package com.jorge.cursojava.aula13;

public class mainCalculadora {

	public static void main(String[] args) {
		
		imprimirNaTela(Calculadora.soma(5, 5));
		
		imprimirNaTela(Calculadora.dividir(10, 5));
		
		imprimirNaTela(Calculadora.subtrair(25, 20));
		
		imprimirNaTela(Calculadora.potencia(5, 4));
		
		imprimirNaTela(Calculadora.fatorial(5));
		
		imprimirNaTela(Calculadora.fatorialRecursivo(5));

	}
	
	static void imprimirNaTela(int arg) {
		System.out.println(arg);
	}
}
