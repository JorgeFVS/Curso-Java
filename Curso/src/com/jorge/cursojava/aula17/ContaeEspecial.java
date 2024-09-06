package com.jorge.cursojava.aula17;

public class ContaeEspecial extends ContaBancaria{
	
	private double limite;
	
	

	public ContaeEspecial() {
		super();
	}

	public ContaeEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		String s =  "Conta Especial ";
		s += "limite " + limite ;
		s += super.toString();
		return s;
	}
	
	public void sacar(double valor) {
		double saldoComLimite = this.getSaldo() + limite;
		
		if ((saldoComLimite - valor) >= 0) {
			this.setSaldo(this.getSaldo() - valor);
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}

}
