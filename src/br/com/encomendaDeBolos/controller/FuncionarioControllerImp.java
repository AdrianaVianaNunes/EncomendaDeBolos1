package br.com.encomendaDeBolos.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.encomendaDeBolos.model.Endereco;
import br.com.encomendaDeBolos.model.Funcionario;

public class FuncionarioControllerImp implements FuncionarioController {

	@Override
	public void inserirFunc(Funcionario func) {
		
		Endereco end = func.getEndereco();
		
		EntityManagerFactory em = Persistence
				.createEntityManagerFactory("encomendaDeBolos-postgres");
		EntityManager mane = em.createEntityManager();
		
		mane.getTransaction().begin();
		
		mane.persist(func);
		
		mane.persist(end);
		
		mane.getTransaction().commit();
		
		mane.close();

	}

	@Override
	public void buscarFunc(Funcionario func) {
		// TODO Auto-generated method stub

	}

	@Override
	public void buscarFunc(String cpf) {
		// TODO Auto-generated method stub

	}

	@Override
	public void alterarFunc(Funcionario func) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerFunc(String cpf) {
		// TODO Auto-generated method stub

	}

}
