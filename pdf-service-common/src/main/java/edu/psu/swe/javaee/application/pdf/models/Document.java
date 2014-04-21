package edu.psu.swe.javaee.application.pdf.models;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "document")
public class Document {
	
	@Id
	private long id;
	
	@Column(unique = true)
	@NotNull
	private UUID uuid;
	
	@ManyToOne(optional = false)
	private Template template;
	
	@ElementCollection
	private Map<String, List<String>> parameters;

}
