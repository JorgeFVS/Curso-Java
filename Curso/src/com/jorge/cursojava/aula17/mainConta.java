package com.jorge.cursojava.aula17;

import java.util.Scanner;

public class mainConta {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ContaBancaria conta1 = new ContaBancaria("Julia", "001", 500);
		
		System.out.println(conta1.getSaldo());
		conta1.sacar(450);
		System.out.println(conta1.getSaldo());
		conta1.depositar(950);
		System.out.println(conta1.getSaldo());
		conta1.sacar(1001);
		System.out.println(conta1.getSaldo());
		System.out.println(conta1.toString());
		
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("Ester", "002", 500, 6);
		
		System.out.println(contaPoupanca.getSaldo());
		contaPoupanca.sacar(450);
		System.out.println(contaPoupanca.getSaldo());
		contaPoupanca.depositar(950);
		System.out.println(contaPoupanca.getSaldo());
		contaPoupanca.sacar(1001);
		System.out.println(contaPoupanca.getSaldo());
		//System.out.println(contaPoupanca.toString());
		System.out.println(contaPoupanca);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
		} else {
			System.out.println("hoje não e dia de rendimento, novo saldo não calculado");
		}
		
		
		ContaeEspecial contaEspecial = new ContaeEspecial("Sonia", "003", 500, 100);
		
		System.out.println(contaEspecial.getSaldo());
		contaEspecial.sacar(450);
		System.out.println(contaEspecial.getSaldo());
		contaEspecial.depositar(950);
		System.out.println(contaEspecial.getSaldo());
		contaEspecial.sacar(1001);
		System.out.println(contaEspecial.getSaldo());
		System.out.println(contaEspecial.toString());
	}

}
