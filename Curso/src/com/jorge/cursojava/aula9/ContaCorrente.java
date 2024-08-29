package com.jorge.cursojava.aula9;

public class ContaCorrente {
	
	String numero;
	String agencia;
	double saldo;
	boolean isSpecial;
	double limite;
	
	boolean saque(double valor) {
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
	
	void deposito(double valor) {
		saldo += valor;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);
	}
	
	boolean verificarUsoLimite() {
		return saldo < 0;
	}

}
