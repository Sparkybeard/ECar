package com.ecar.domain.exception;

public class InvalidEmailException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmailException(){
		
	}
	
	public InvalidEmailException(String msg){
		super(msg);
	}
	
}
