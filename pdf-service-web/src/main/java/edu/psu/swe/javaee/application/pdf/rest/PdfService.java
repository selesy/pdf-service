package edu.psu.swe.javaee.application.pdf.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class PdfService extends Application {
	
	static Set<Class<?>> classes;
	
	{
		classes = new HashSet<>();
		classes.add(DocumentResourceImpl.class);
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		return classes;
	}

}
