package edu.psu.swe.javaee.application.pdf.injection;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerInjector {
	
	@Produces
	public Logger produceLogger(InjectionPoint injectionPoint) {
		Class<?> loggedClass = injectionPoint.getMember().getDeclaringClass();
		return LoggerFactory.getLogger(loggedClass);
	}

}
