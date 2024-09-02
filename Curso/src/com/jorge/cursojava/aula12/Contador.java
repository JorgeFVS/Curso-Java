package com.jorge.cursojava.aula12;

public class Contador {
	
	private static int cont;
	
	

	public Contador() {
		incrementar();
	}

	
	public static void incrementar() {
		cont ++;
	}
	
	public static void zerar() {
		cont = 0;
	}
	
	public static int getNumero() {
		return cont;
	}
	

}
