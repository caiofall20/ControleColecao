package services;

import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import models.Carrinho;
import dao.carrinhoDAO;

@Path("/carrinho")
public class CarrinhoService {
	
	private carrinhoDAO CarrinhoDAO;
	
	public CarrinhoService() {
		 CarrinhoDAO = new carrinhoDAO();
	}
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getCarrinhos() {
		return Response.status(Status.OK).entity(this.CarrinhoDAO.listCarrinhos()).build();
	}

	@GET
	@Path("/carrinho/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response pesquisar(@PathParam("id") Long id) {
		return Response.ok().entity(CarrinhoDAO.pesquisar(id)).build();

	}
	
	@POST
	@Path("/carrinho/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@PermitAll
	public Response salvar(Carrinho c) {
		return Response.status(Status.OK).entity(this.CarrinhoDAO.salvar(c)).build();
	}
		
	

	@DELETE
	@Path("carrinho/{id}")
	public Response apagar(@PathParam("id") Long id) {
		return Response.ok().entity(CarrinhoDAO.apagar(id)).build();
	}
}
