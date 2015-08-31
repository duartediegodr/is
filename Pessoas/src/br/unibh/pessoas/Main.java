package br.unibh.pessoas;

import java.util.Date;

import br.unibh.pessoas.entidades.PessoaFisica;

public class Main {
	
	
	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica(1L, "José", "Rua b", "3333-8888","080808222-44"
				,"jose@jose.com",new Date(),"M");
		
		System.out.println(pf1);
	}
}
