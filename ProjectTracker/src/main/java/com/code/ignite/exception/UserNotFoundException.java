package com.code.ignite.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 4283691256835571232L;

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public UserNotFoundException() {
	}
}
