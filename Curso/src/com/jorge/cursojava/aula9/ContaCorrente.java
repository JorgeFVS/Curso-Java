package com.jorge.cursojava.aula9;

public class ContaCorrente {
	
	private String numero;
	private String agencia;
	private double saldo;
	private boolean isSpecial;
	private double limite;
	
	
	
	public ContaCorrente() {
		
	}
	
	

	public ContaCorrente(String numero, String agencia, double saldo, boolean isSpecial, double limite) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.isSpecial = isSpecial;
		this.limite = limite;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getAgencia() {
		return agencia;
	}



	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public boolean isSpecial() {
		return isSpecial;
	}



	public void setSpecial(boolean isSpecial) {
		this.isSpecial = isSpecial;
	}



	public double getLimite() {
		return limite;
	}



	public void setLimite(double limite) {
		this.limite = limite;
	}



	public boolean saque(double valor) {
		if(saldo >= valor) {
			saldo =- valor;
			return true;
		} else {
			if (isSpecial) {
				double especialLimite = limite + saldo;
				if(especialLimite >= valor) {
					saldo -= valor;
					return true;
				} else {
					return false;
				}
			} else {
				return  false;
			}
		}
		
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);
	}
	
	public boolean verificarUsoLimite() {
		return saldo < 0;
	}

}
