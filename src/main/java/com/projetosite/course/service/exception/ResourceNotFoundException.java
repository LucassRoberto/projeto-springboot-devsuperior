package com.projetosite.course.service.exception;

public class ResourceNotFoundException extends RuntimeException {//exception que o compilador não obriga a tratar
	private static final long serialVersionUID = 1L; 

	public ResourceNotFoundException (Object id) {
		super ("Resource not found. Id " + id);
	}
}
