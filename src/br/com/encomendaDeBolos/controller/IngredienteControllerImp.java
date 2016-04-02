package br.com.encomendaDeBolos.controller;

import javax.persistence.EntityManager;

import br.com.encomendaDeBolos.model.Ingredientes;
import br.com.encomendaDeBolos.util.JPAUtil;

public class IngredienteControllerImp implements IngredienteController{

	@Override
	public void inserirIngrediente(Ingredientes ingred) {
		// TODO Auto-generated method stub
		EntityManager mane = new JPAUtil().getEntityManager();
		
		mane.getTransaction().begin();
			//end = mane.find(Endereco.class,end.getId());
				
		mane.persist(ingred);
		
		
		mane.getTransaction().commit();
		
		mane.close();
		
	}

	@Override
	public void removerIngrediente(Ingredientes ingred) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarIngrediente(Ingredientes ingred) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarIngrediente(Ingredientes ingred) {
		// TODO Auto-generated method stub
		
	}

}
