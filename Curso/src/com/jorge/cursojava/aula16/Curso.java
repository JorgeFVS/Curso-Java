package com.jorge.cursojava.aula16;

public class Curso {
	
	private String nome;
	private String horario;
	private Professor professor;
	private Aluno[] alunos;
	
	public Curso() {
		
	}

	public Curso(String nome, String horario, Professor professor, Aluno[] aluno) {
		this.nome = nome;
		this.horario = horario;
		this.professor = professor;
		this.alunos = aluno;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAluno() {
		return alunos;
	}

	public void setAluno(Aluno[] aluno) {
		this.alunos = aluno;
	}
	
	public String obterInfo() {
		String info = "Nome do curso = " + nome + "\n";
		
		if (professor != null) {
			info += professor.obterInfo();
		}
		
		if (alunos != null) {
			System.out.println("---Alunos---");
			for(Aluno aluno : alunos) {
				info += aluno.obterInfo();
			}
		}
		
		info += obterMediaTurma();	
		
		return info;
	}
	
	public double obterMediaTurma() {
		double soma = 0;
		for(Aluno aluno : alunos) {
			if (aluno != null) {
				soma += aluno.obterMedia();
			}
		}
		return soma/alunos.length;
	}
}
