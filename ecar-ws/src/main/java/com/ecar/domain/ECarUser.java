package com.ecar.domain;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import com.ecar.domain.exception.UserHasNoCarException;
import com.ecar.ws.InsufficientCreditFault_Exception;

public class ECarUser {
	private String userEmail = null;
	private AtomicInteger saldo;
	private AtomicBoolean hasCar = new AtomicBoolean(false);
	
	public ECarUser(String userEmail, int saldoI) {
		this.userEmail = userEmail;
		saldo = new AtomicInteger(saldoI);
	}
	
	public String getEmail(){
		return userEmail;
	}	
	
	public int getCredit(){
		return saldo.get();
	}

	public Boolean getHasCar() {
		return hasCar.get();
	}

	public synchronized void validateCanRentCar() throws UserHasNoCarException{
		if( ! getHasCar()) {
			throw new UserHasNoCarException();
		}
		
	}

	public  synchronized void effectiveRent() throws InsufficientCreditFault_Exception {
		decrementSaldo();
		hasCar.set(true);
		// TODO Auto-generated method stub
	}

	private void decrementSaldo() throws InsufficientCreditFault_Exception{
		 if(saldo.get() > 0) {
			 saldo.decrementAndGet();
		 } else {
			 throw new InsufficientCreditFault_Exception(userEmail, null);
		 }
		// TODO Auto-generated method stub
		
	}

	public void validateCanReturnBina() throws UserHasNoCarException {
		if( ! getHasCar()) {
			throw new UserHasNoCarException();
		}
		
	}

	public void effectiveReturn(int prize) throws UserHasNoCarException {
		if( ! getHasCar()) {
			throw new UserHasNoCarException();
		}
		hasCar.set(false);
		incrementBalance(prize);
	}

	private void incrementBalance(int quantity) {
		// TODO Auto-generated method stub
		 saldo.getAndAdd(quantity);
	}
		
	}
		
		
	
	

