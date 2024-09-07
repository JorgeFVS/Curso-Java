package com.jorge.cursojava.aula18;

public class Peixe extends Animal {

	private String caracteristicas;

	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("cinzenta");
		this.setCaracteristicas("Barbatanas e cauda");
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s+= "\n Características: " + caracteristicas;
		return s;
	}
}
