package com.jorge.cursojava.aula14;

public class mainContato {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Jonas");
		
		// Relacionamento: classe contato tem-um Endereço
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Av Paulista");
		endereco.setNumero("59");
		endereco.setEstado("SP");
		endereco.setCidade("SP");
		endereco.setComplemento("2º andar");
		endereco.setCep("00000000");
		
		contato.setEndereco(endereco);
		
		// Relacionamento: classe contato tem-um Telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("cel");
		telefone.setDdd("11");
		telefone.setNumero("40028922");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("cel");
		telefone2.setDdd("12");
		telefone2.setNumero("20028922");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone; 
		telefones[1] = telefone2;
		
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());
		System.out.println(contato.getEndereco().getCidade());
		
		for(Telefone t : contato.getTelefones()) {
			System.out.println(t.getNumero());
		}
	

	}

}
