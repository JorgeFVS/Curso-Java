package com.jorge.cursojava.aula16;

import java.util.Scanner;

public class mainCurso {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Programa de criação de cursos");
		System.out.println("Informe o nome do curso: ");
		String nomeDoCurso = scan.next();
		
		System.out.println("Informe o horario do curso, diurno ou noturno: ");
		String horario = scan.next();
		
		System.out.println("Informações do Professor: ");
		System.out.println("Nome: ");
		String nomeDoProfessor = scan.next();
		System.out.println("Departamento: ");
		String departamento = scan.next();
		System.out.println("Email: ");
		String email = scan.next();
		
		Professor professor = new Professor(nomeDoProfessor, departamento, email);
		
		System.out.println("---Alunos---");
		
		Aluno[] alunos = new Aluno[5];
	
		
		for(int i = 0; i<5; i++) {
			System.out.println("Nome: " + (i+1));
			String nomeAluno = scan.next();
			System.out.println("Matricula: " + (i+1));
			String matriculaAluno = scan.next();
			
			double[] notas = new double[4];
			
			for(int j = 0; j<4; j++) {
				System.out.println("Nota: " + (j+1));
				notas[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno(nomeAluno, matriculaAluno, notas);
			alunos[i] = aluno;
			
		}
		
		Curso curso = new Curso(nomeDoCurso, horario, professor, alunos);
		
		System.out.println(curso.obterInfo());
		

	}

}
