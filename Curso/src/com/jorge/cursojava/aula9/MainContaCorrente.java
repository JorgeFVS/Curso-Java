package com.jorge.cursojava.aula9;

public class MainContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.setSpecial(true);
		conta.setNumero("123456");
		conta.setAgencia("1234");
		conta.setSaldo(-10);
		conta.setLimite(500);
		
		System.out.println("É uma conta especial? " + conta.isSpecial());
		System.out.println("numero da conta: " + conta.getNumero());
		System.out.println("agencia: " + conta.getAgencia());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("Limite: " + conta.getLimite());
		
		boolean saqueEfetuado = conta.saque(10);
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possivel realizar saque: saldo insuficiente");
		}
		
		conta.deposito(500);
		conta.consultarSaldo();
		
		if (conta.verificarUsoLimite()) {
			System.out.println("Esta usando limite");
		} else {
			System.out.println("Não esta usando limite");
		}
	}

}
