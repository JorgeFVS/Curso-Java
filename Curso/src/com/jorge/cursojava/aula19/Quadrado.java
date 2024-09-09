package com.jorge.cursojava.aula19;

public class Quadrado extends Figura2D {
	
	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
		//A mesma coisa que return Math.pow(lado, 2);
	}

}
