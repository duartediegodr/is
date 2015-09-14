package br.unibh.pessoas;

import br.unibh.pessoas.persitencia.PessoaFisicaDAO;

public class Main {
	
	
	public static void main(String[] args) {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		dao.findAll();
	}
}
