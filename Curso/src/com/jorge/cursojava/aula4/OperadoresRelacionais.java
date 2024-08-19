package com.jorge.cursojava.aula4;

import java.util.Scanner;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int valor1 = 1;
		int valor2 = 2;
		
		System.out.println("valor1 == valor2: " + (valor1 == valor2));
		System.out.println("valor1 != valor2: " + (valor1 != valor2));
		System.out.println("valor1 > valor2: " + (valor1 > valor2));
		System.out.println("valor1 >= valor2: " + (valor1 >= valor2));
		System.out.println("valor1 < valor2: " + (valor1 < valor2));
		System.out.println("valor1 <= valor2: " + (valor1 <= valor2));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de metros: ");
		int metros = scan.nextInt();
		int formula = metros * 100;
		System.out.println(metros + " metros convertido para centimetros é igual a: " + formula);
	}

}
