package org.jugvale.appinscricoes;

import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.jugvale.appinscricoes.model.TipoEvento;
import org.junit.Before;
import org.junit.Test;

/**
 * Testa as classes de modelo e a conexão com o banco das mesmas.
 * 
 * @author William Antônio
 * 
 */
public class TestaModel {
	EntityManagerFactory emf;
	EntityManager em;

	@Before
	public void initEmfAndEm() {
		emf = Persistence.createEntityManagerFactory("default");
		em = emf.createEntityManager();
	}

	@Test
	public void testaTipoEvento() {
		acoesComuns(new TipoEvento("Misto",
				"Evento misto com diversas atividades"), new TipoEvento(
				"Palestras", "Evento com palestas"),
				"select t from TipoEvento t");
	}

	/**
	 * 
	 * Esse é um método véio de guerra que uso para testar duas entidades
	 * <p>
	 * Simplesmente passe duas instâncias novas de entidades anotadas e ele
	 * testa persistência, busca e deleção...
	 * 
	 * @param o1
	 * @param o2
	 * @param busca
	 *            A query JPA para recuperar esse objeto
	 */
	@SuppressWarnings("unchecked")
	public void acoesComuns(Object o1, Object o2, String busca) {
		em.getTransaction().begin();
		em.persist(o1);
		em.persist(o2);
		em.getTransaction().commit();
		List<Object> objetos = em.createQuery(busca).getResultList();
		assertTrue(objetos.size() == 2);

		em.getTransaction().begin();
		for (Object o : objetos) {
			em.remove(o);
		}
		em.getTransaction().commit();

		objetos = em.createQuery(busca).getResultList();
		assertTrue(objetos.size() == 0);
	}
}
