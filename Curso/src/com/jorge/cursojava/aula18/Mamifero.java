package com.jorge.cursojava.aula18;

public class Mamifero extends Animal {
	
	private String alimento;

	public Mamifero() {
		super();
		this.setCor("castanho");
		this.setAlimento("Mel");
		this.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s+= " \n Mamifero  alimento = " + alimento + "]";
		return s;
	}
	

}
