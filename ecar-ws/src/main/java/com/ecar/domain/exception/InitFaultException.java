package com.ecar.domain.exception;

public class InitFaultException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InitFaultException(){
		
	}
	
	public InitFaultException(String msg){
		super(msg);
	}
}
