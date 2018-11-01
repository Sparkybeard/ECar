package com.ecar.domain.exception;

public class NoParkFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoParkFoundException() {
	}

	public NoParkFoundException(String msg) {
		super(msg);
	}
}