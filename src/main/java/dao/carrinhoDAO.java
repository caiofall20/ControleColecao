package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.Carrinho;;

public class carrinhoDAO {
	public Carrinho salvar(Carrinho c) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.merge(c);
		em.getTransaction().commit();

		return c;
	}

	public Carrinho pesquisar(Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		return em.find(Carrinho.class, id);
	}

	public Carrinho apagar(Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		Carrinho carrinho = pesquisar(id);

		em.getTransaction().begin();
		em.remove(em.find(Carrinho.class, carrinho.getId()));
		em.getTransaction().commit();
		return carrinho;
	}

	public List<Carrinho> listCarrinhos() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();

		List<Carrinho> carrinho = em.createQuery("from Carrinho", Carrinho.class).getResultList();
		return carrinho;
	}
}
