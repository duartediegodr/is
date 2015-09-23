package br.unibh.pessoas;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.entidades.PessoaJuridica;
import br.unibh.pessoas.persistencia.PessoaFisicaDAO;
import br.unibh.pessoas.persistencia.PessoaJuridicaDAO;

public class Testes {
	/**********************
	/ Testes PessoaFisica /
	/********************/
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
	
	@Test
	public void testaPessoaFisicaInserirExcluir(){
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica pf = new PessoaFisica(null, "Fulano da Silva", "Rua A", 
				"3188885555", "11111112211", "fulano@fulano.com", new Date(), "M");
		
		dao.insert(pf);
		
		PessoaFisica pf2 = dao.find("Fulano da Silva");
		
		Assert.assertNotNull(pf2);
		
		dao.delete(pf2);
		PessoaFisica pf3 = dao.find("Fulano da Silva");
		
		Assert.assertNull(pf3);
	}
	
	@Test
	public void testaPessoaFisicaAtualizar(){
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica pf = new PessoaFisica(null, "Ciclano da Silva", "Rua A", 
				"3188885555", "11111112211", "ciclano@email.com", new Date(), "M");
		
		dao.insert(pf);
		
		PessoaFisica pf2 = dao.find("Ciclano da Silva");
		pf2.setNome("Beltrano da Silva");
		pf2.setEmail("beltrano@email.com");
		dao.update(pf2);
		
		PessoaFisica pf3 = dao.find("Beltrano da Silva");
		Assert.assertEquals("beltrano@email.com", pf3.getEmail());

		Assert.assertNotNull(pf2);
		dao.delete(pf3);
		
		PessoaFisica pf4 = dao.find("Beltrano da Silva");
		Assert.assertNull(pf4);
	}
	
	/**********************
	/ Testes PessoaJuridica /
	/********************/
	
	
	@Test
	public void testePessoaJuridicaFindAll(){
		
		List<PessoaJuridica> lista = new PessoaJuridicaDAO().findAll();
		Assert.assertEquals(lista.size(), 100);
		
	}
	
	@Test
	public void testePessoaJuridicaFind(){
		
		PessoaJuridica pessoa = new PessoaJuridicaDAO().find(3L);
		Assert.assertEquals("Mollis Duis Sit Limited", pessoa.getNome());
		
	}
	
	@Test
	public void testaPessoaJuridicaInserirExcluir(){
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica pf = new PessoaJuridica(null, "Empresa Fulano", "Rua A", 
				"3188885555", "11111112222345", new Date(), "empresafulano.com");
		
		dao.insert(pf);
		
		PessoaJuridica pf2 = dao.find("Empresa Fulano");
		
		Assert.assertNotNull(pf2);
		
		dao.delete(pf2);
		PessoaJuridica pf3 = dao.find("Empresa Fulano");
		
		Assert.assertNull(pf3);
	}
	
	@Test
	public void testaPessoaJuridicaAtualizar(){
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica pf = new PessoaJuridica(null, "Empresa Ciclano", "Rua A", 
				"3188885555", "11111112222345", new Date(), "empresaciclano.com");
		
		dao.insert(pf);
		
		PessoaJuridica pf2 = dao.find("Empresa Ciclano");
		pf2.setNome("Empresa Beltrano");
		pf2.setSite("empresabeltrano.com");
		dao.update(pf2);
		
		PessoaJuridica pf3 = dao.find("Empresa Beltrano");
		Assert.assertEquals("empresabeltrano.com", pf3.getSite());

		Assert.assertNotNull(pf2);
		dao.delete(pf3);
		
		PessoaJuridica pf4 = dao.find("Empresa Beltrano");
		Assert.assertNull(pf4);
	}
	
}
