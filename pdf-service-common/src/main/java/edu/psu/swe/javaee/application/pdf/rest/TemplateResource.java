package edu.psu.swe.javaee.application.pdf.rest;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import edu.psu.swe.javaee.application.pdf.models.Template;

@Path("templates")
public interface TemplateResource {
	
	@GET
	public List<Template> retrieveTemplates();
	
	@GET
	@Path("{id}")
	public Template retrieveTemplate(@PathParam("id") String id);
	
	@POST
	@Consumes("application/xml")
	@Produces("application/xml")
	public Template createTemplate();

}
