package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.Usuario;

public class UsuarioDAO {
	public Usuario salvar(Usuario u) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		
		return u;
	}

	public Usuario pesquisar(Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		return em.find(Usuario.class, id);
	}

	public Usuario apagar(Long id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		Usuario usuario = pesquisar(id);

		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();
		return usuario;
	}

	public List<Usuario> listUsuarios() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();

		List<Usuario> usuarios = em.createQuery("from Usuario", Usuario.class).getResultList();
		return usuarios;
	}

}

