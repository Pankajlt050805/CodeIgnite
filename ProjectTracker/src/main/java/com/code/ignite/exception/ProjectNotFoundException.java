package com.code.ignite.exception;

public class ProjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 4283691256835571232L;

	public ProjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ProjectNotFoundException() {
	}
}
