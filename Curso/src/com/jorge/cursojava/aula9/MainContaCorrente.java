package com.jorge.cursojava.aula9;

public class MainContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.isSpecial = true;
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.saldo = -10;
		conta.limite = 500;
		
		System.out.println("É uma conta especial? " + conta.isSpecial);
		System.out.println("numero da conta: " + conta.numero);
		System.out.println("agencia: " + conta.agencia);
		System.out.println("Saldo: " + conta.saldo);
		System.out.println("Limite: " + conta.limite);
		
		boolean saqueEfetuado = conta.saque(10);
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta: " + conta.saldo);
		} else {
			System.out.println("Não foi possivel realizar saque: saldo insuficiente");
		}
		
		conta.deposito(500);
		System.out.println("saldo atual da conta = : " + conta.saldo);
	}

}
