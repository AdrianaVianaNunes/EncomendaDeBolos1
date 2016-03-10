package br.com.encomendaDeBolos.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.encomendaDeBolos.util.JPAUtil;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("teste");
		p.setSenha("senha");
		
		
		EntityManager mane = new JPAUtil().getEntityManager();
		
		mane.getTransaction().begin();
		mane.persist(p);
		p.setNome("Jose");
		
		mane.getTransaction().commit();
		mane.close();

	}

}
