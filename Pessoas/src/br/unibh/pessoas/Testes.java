package br.unibh.pessoas;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.persistencia.PessoaFisicaDAO;

public class Testes {

	@Ignore
	@Test
	public void testePessoaFisicaFindAll(){
		
		List<PessoaFisica> lista = new PessoaFisicaDAO().findAll();
		Assert.assertEquals(lista.size(), 100);
		
	}
	
	@Test
	public void testePessoaFisicaFind(){
		
		PessoaFisica pessoa = new PessoaFisicaDAO().find(3L);
		Assert.assertEquals("Tiger A. Hodge", pessoa.getNome());
		
	}
}
