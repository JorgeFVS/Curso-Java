package com.jorge.cursojava.aula13;

public class Calculadora {
	
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int potencia(int num1, int num2) {
		int resultado = 0;
		for(int i = 0; i < num2; i++) {
			resultado = num1 * num2;
		}
		return resultado;
	}
	
	public static int fatorial(int num) {
		if(num == 0) {
			return 1;
		}
		
		int total = 1;
		for(int i = num; i > 1; i--) {
			total *= i;
		}
		
		return total;
	} 
	
	public static int fatorialRecursivo(int num) {
		if (num == 0) {
			return 1;
		}
		
		return num * fatorialRecursivo(num - 1);
	}

}
