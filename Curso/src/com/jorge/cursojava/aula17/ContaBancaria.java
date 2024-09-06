package com.jorge.cursojava.aula17;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	
	public ContaBancaria() {}

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		String s =  "";
		s += " Nome cliente: " + nomeCliente;
		s += " Numero da conta: " + numConta;
		s += " Saldo: " + saldo;
		return s;
	}

	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
}
