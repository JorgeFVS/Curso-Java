package com.jorge.cursojava.aula10;

import java.util.Scanner;

public class mainAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o nome do aluno: ");
		String nomeAluno = scan.next();
		
		System.out.println("Informe a matricula do aluno: ");
		String matricula = scan.next();
		
		System.out.println("Informe o curso do aluno: ");
		String curso = scan.next();
		
		aluno1.nome = nomeAluno;
		aluno1.matricula = matricula;
		aluno1.curso = curso;
		
		
		
		aluno1.disciplinas = new String[3];
		aluno1.notas = new double[3][4];
		
		for(int i = 0; i < aluno1.disciplinas.length; i++) {
			System.out.println("Informe as disciplinas: " + (i+1));
			aluno1.disciplinas[i] = scan.next();
		}
		
		for(int i = 0; i < aluno1.notas.length; i++) {
			System.out.println("Obtendo notas da disciplina" + aluno1.disciplinas[i]);
			
			for (int j = 0; j < aluno1.notas[i].length; j++) {
			
				System.out.println("Entre com a nota" + (j+1));
				aluno1.notas[i][j] = scan.nextDouble();
				
			}
		}
		
		aluno1.mostrarInfo();
		
		System.out.println("Informe a disciplina para saber se foi aprovado: ");
		int estaAprovado = scan.nextInt();
		
		boolean aprovadoNaMateria = aluno1.isAprovado(estaAprovado);
		
		if(aprovadoNaMateria) {
			System.out.println("esta aprovado ");
		} else {
			System.out.println("reprovado ");
		}
		
		scan.close();
		
		
	}

}
