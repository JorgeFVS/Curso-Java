package com.jorge.cursojava.aula10;

import java.util.Arrays;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String[] disciplinas;
	double[][] notas;
	
	void mostrarInfo() {
		System.out.println("Nome do aluno: " + nome);
		System.out.println("matricula do aluno: " + matricula);
		System.out.println("curso do aluno: " + curso);
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Notas da disciplina " + disciplinas[i]);
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	boolean isAprovado(int indice) {
		
		double soma = 0;
		
		for (int i = 0; i < notas[indice].length; i++) {
			soma += notas[indice][i];
		}
		
		double media = soma / 4;
		
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
