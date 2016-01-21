package br.com.encomendaDeBolos.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("teste");
		p.setSenha("senha");
		
		EntityManagerFactory em = Persistence.createEntityManagerFactory("pessoas-postgres");
		EntityManager mane = em.createEntityManager();
		
		mane.getTransaction().begin();
		mane.persist(p);
		p.setNome("Jose");
		
		mane.getTransaction().commit();
		mane.close();

	}

}
