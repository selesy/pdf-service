/**
 * 
 */
package edu.psu.swe.javaee.application.pdf.rest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.core.MultivaluedMap;

import org.slf4j.Logger;

/**
 * @author smoyer1
 *
 */
public class DocumentResourceImpl implements DocumentResource {
	
	@Inject
	Logger logger_;

	/* (non-Javadoc)
	 * @see edu.psu.swe.javaee.application.pdf.rest.DocumentResource#retrieveDocumentAsPdf(java.util.UUID)
	 */
	public String retrieveDocumentAsPdf(UUID uuid) {
		logger_.trace("retrieveDocumentAsPdf()");
		logger_.debug("Retrieved document UUID: " + uuid);
		// TODO Auto-generated method stub
		return "This is a test";
	}

	/* (non-Javadoc)
	 * @see edu.psu.swe.javaee.application.pdf.rest.DocumentResource#createDocument(javax.ws.rs.core.MultivaluedMap)
	 */
	public URL createDocument(MultivaluedMap<String, String> form) {
		logger_.trace("createDocument()");
		logger_.debug("form entry count: " + form.size());
		for(String key: form.keySet()) {
			logger_.debug("Key: " + key);
			for(String value: form.get(key)) {
				logger_.debug("Value: " + value);
			}
		}
		// TODO Auto-generated method stub
		URL url = null;
		try {
			url = new URL("http://www.google.com");
		} catch(MalformedURLException e) {
			// TODO
		}
		return url;
	}

	/* (non-Javadoc)
	 * @see edu.psu.swe.javaee.application.pdf.rest.DocumentResource#createDocumentFromJson()
	 */
	public URL createDocumentFromJson() {
		// TODO Auto-generated method stub
		return null;
	}

}
