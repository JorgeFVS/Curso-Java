package com.jorge.cursojava.aula8;

public class MainLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();

		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}

}
