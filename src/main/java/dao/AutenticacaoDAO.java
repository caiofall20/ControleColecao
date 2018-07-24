package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import models.Usuario;

public class AutenticacaoDAO {
	
	private EntityManager manager;

	public AutenticacaoDAO() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		manager = emf.createEntityManager();
	}

	
	public Usuario login(Usuario usuario) {
		Usuario cli = null;
		try {
			manager.getTransaction().begin();
			TypedQuery<Usuario> query = manager
					.createQuery("select c from Cliente c where c.email = :email and c.senha = :senha ", Usuario.class);
			query.setParameter("email", usuario.getEmail());
			query.setParameter("senha", usuario.getSenha());
			cli = query.getSingleResult();
			manager.getTransaction().commit();
		} catch (PersistenceException e) {
			manager.getTransaction().rollback();

		}finally{
			manager.close();
		}
		return cli;

	}

}
