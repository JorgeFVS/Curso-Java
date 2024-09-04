package com.jorge.cursojava.aula15;

import java.util.Scanner;

public class mainAgenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome da agenda");
		String nomeAgenda = scan.next();
		
		Agenda agenda = new Agenda(nomeAgenda);
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0; i<contatos.length; i++) {
			System.out.println("Entre com as informações do contato " + (i+1));
			
			System.out.println("Entre com o nome");
			String nome = scan.next();
			System.out.println("Entre com o telefone");
			String telefone = scan.next();
			System.out.println("Entre com o email");
			String email = scan.next();
			
			Contato c = new Contato(nome, telefone, email);
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		System.out.println(agenda.obterInfo());
	}

}
