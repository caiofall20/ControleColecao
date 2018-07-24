package services;

import javax.annotation.security.PermitAll;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dao.AutenticacaoDAO;
import models.Usuario;

@Path("")
public class AutenticacaoService {

	@POST
	@Path("/login")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@PermitAll
	public Response login(Usuario usuario) {
		AutenticacaoDAO autenticacaoDAO = new AutenticacaoDAO();
		Usuario cli = autenticacaoDAO.login(usuario);
		System.out.println(usuario);
		
		if(cli == null){
			return Response.status(Status.NOT_FOUND).entity("Usuario não cadastrado.").build();
			
		}else{
			return Response.status(Status.OK).entity(cli).build();
		}
	}

}
