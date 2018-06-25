package testes;

import models.Carrinho;
import dao.carrinhoDAO;






public class CarrinhoTeste {
	public static void main(String[] args) {
		Carrinho carrinho = new Carrinho();
				carrinho.setMarca("Hot Whells");
				carrinho.setModelo("The Bat");
				carrinho.setColecao("batman");
				carrinho.setEscala(1.64F);
		System.out.println("Carrinho adicionado");
			carrinhoDAO carrinhoDAO = new carrinhoDAO();
			carrinhoDAO.salvar(carrinho);
}
}
