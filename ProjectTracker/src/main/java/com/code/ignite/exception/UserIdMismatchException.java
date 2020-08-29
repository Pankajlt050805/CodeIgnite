package com.code.ignite.exception;

public class UserIdMismatchException extends RuntimeException {

	private static final long serialVersionUID = 4283691256835571232L;

	public UserIdMismatchException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserIdMismatchException() {
	}
}
