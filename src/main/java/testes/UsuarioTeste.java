package testes;

import dao.AutenticacaoDAO;
import dao.UsuarioDAO;
import models.Usuario;

public class UsuarioTeste {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.setNome("Caio Mateus");
		usuario.setCpf("12345678900");
		usuario.setTelefone("99999999");
		usuario.setEmail("caio@exemplo.com");
		usuario.setSenha("123");

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
	}
}
