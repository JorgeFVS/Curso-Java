package com.jorge.cursojava.aula17;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private double diaRendimento;
	
	
	
	
	public ContaPoupanca() {
		super();
	}


	public ContaPoupanca(String nomeCliente, String numConta, double saldo, double diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}



	public double getDiaRendimento() {
		return diaRendimento;
	}



	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s =  "Conta Poupança ";
		s += "rendimento por dia: " + diaRendimento ;
		s += super.toString();
		return s;
	}

	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		} else {
			return false;
		}
	}

}
