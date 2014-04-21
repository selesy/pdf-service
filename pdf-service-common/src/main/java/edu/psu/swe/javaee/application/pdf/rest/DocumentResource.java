package edu.psu.swe.javaee.application.pdf.rest;

import java.net.URL;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;

@Path("documents")
public interface DocumentResource {

	@GET
	@Path("{uuid}")
	@Produces("application/xml")
	public String retrieveDocumentAsPdf(@PathParam("uuid") UUID uuid);
	
	@POST
	@Consumes("application/x-www-form-urlencoded")
	public URL createDocument(MultivaluedMap<String, String> form);
	
	@POST
	@Consumes("application/json")
	public URL createDocumentFromJson();
	
}
