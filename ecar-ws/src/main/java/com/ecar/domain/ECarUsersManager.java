package com.ecar.domain;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.ecar.domain.exception.InvalidEmailException;
import com.ecar.domain.exception.NoUserFoundException;
import com.ecar.domain.exception.UserExistsException;

public class ECarUsersManager {

	private static class SingletonHolder {
		private static final ECarUsersManager INSTANCE = new ECarUsersManager();
	}
	
	public static synchronized ECarUsersManager getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	public static int SALDO_INICIAL = 10;
	public AtomicInteger saldoI = new AtomicInteger(SALDO_INICIAL);
	
	private Map<String, ECarUser> registeredECarUsers = new ConcurrentHashMap<>();
	
	public synchronized ECarUser RegisterNewECarUser(String userEmail) throws UserExistsException, InvalidEmailException{
		if(userEmail == null || userEmail.trim().length() == 0 || !userEmail.matches("\\w+(\\.?\\w)*@\\w+(\\.?\\w)*")) {
	
		throw new InvalidEmailException();}
		
		try{
			getUser(userEmail);
			
			throw new UserExistsException();
		}catch(NoUserFoundException e){
			ECarUser eCUser = new ECarUser(userEmail, saldoI.get());
		
			registeredECarUsers.put(userEmail, eCUser);
			return eCUser;
		}
		
	}

	public ECarUser getUser(String userEmail) throws NoUserFoundException {
		ECarUser eCUser = registeredECarUsers.get(userEmail);
		
		if(eCUser == null) throw new NoUserFoundException();
		
		return eCUser;
	}

	public synchronized void reset() {
		registeredECarUsers.clear();
		saldoI.set(SALDO_INICIAL);
		// TODO Auto-generated method stub
		
	}

	public synchronized void init(int initialUserCredit) {
		saldoI.set(initialUserCredit); 		
	}
	
}
