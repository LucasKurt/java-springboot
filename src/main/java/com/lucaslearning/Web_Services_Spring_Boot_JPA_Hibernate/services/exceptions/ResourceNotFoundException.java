package com.lucaslearning.Web_Services_Spring_Boot_JPA_Hibernate.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resource not Found. Id " + id);
	}
}
