package com.jorge.cursojava.aula7;

public class IstanciaContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.isSpecial = false;
		conta.numero = "001";
		conta.agencia = "556";
		conta.saldo = 5000;
		conta.limite = 90000;
		
		System.out.println("É uma conta especial? " + conta.isSpecial);
		System.out.println("numero da conta: " + conta.numero);
		System.out.println("agencia: " + conta.agencia);
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("Limite: " + conta.limite);

	}

}
