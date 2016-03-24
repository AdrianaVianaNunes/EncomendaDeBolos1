package br.com.encomendaDeBolos.controller;

import javax.persistence.EntityManager;

import br.com.encomendaDeBolos.model.Cliente;
import br.com.encomendaDeBolos.model.Endereco;
import br.com.encomendaDeBolos.util.JPAUtil;

public class ClienteControllerImp implements ClienteController{

	@Override
	public void inserirCliente(Cliente cliente) {
		
		Endereco end = cliente.getEndereco();
		
		EntityManager mane = new JPAUtil().getEntityManager();
				
		mane.getTransaction().begin();
			//end = mane.find(Endereco.class,end.getId());
				
		mane.persist(end);
		mane.persist(cliente);
		
		mane.getTransaction().commit();
		
		mane.close();
		
	}

	@Override
	public void removerCliente(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarCliente(String cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarCliente(Cliente cpf) {
		// TODO Auto-generated method stub
		
	}

}
