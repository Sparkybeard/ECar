package com.ecar.domain;

import java.util.ArrayList;
import java.util.Collection;

import com.ecar.domain.exception.InitFaultException;
import com.ecar.domain.exception.InvalidEmailException;
import com.ecar.domain.exception.NoParkFoundException;
import com.ecar.domain.exception.NoUserFoundException;
import com.ecar.domain.exception.UserExistsException;
import com.ecar.domain.exception.UserHasNoCarException;
import com.ecar.park.ws.BadInitFault_Exception;
import com.ecar.park.ws.NoSpaceFault_Exception;
import com.ecar.park.ws.ParkInfo;
import com.ecar.park.ws.Xy;
import com.ecar.park.ws.cli.ParkClient;
import com.ecar.park.ws.cli.ParkClientException;
import com.ecar.ws.CarNotRentedFault_Exception;
import com.ecar.ws.CoordinatesView;
import com.ecar.ws.InitFault_Exception;
import com.ecar.ws.InitParkFault;
import com.ecar.ws.InitParkFault_Exception;
import com.ecar.ws.InsufficientCreditFault_Exception;
import com.ecar.ws.NoCarAvailableFault_Exception;
import com.ecar.ws.ParkFullFault_Exception;
import com.ecar.ws.ParkView;
import com.ecar.ws.UserAlreadyHasCarFault_Exception;


import pt.ulisboa.tecnico.sdis.ws.uddi.UDDINaming;
import pt.ulisboa.tecnico.sdis.ws.uddi.UDDINamingException;
import pt.ulisboa.tecnico.sdis.ws.uddi.UDDIRecord;

public class ECarManager {

	// Singleton -------------------------------------------------------------

	private ECarManager() {
	}
	
	private String id;
	
	private String parkName=null;	
	
	private String uddiURL = null;
	
	/**
	 * SingletonHolder is loaded on the first execution of Singleton.getInstance()
	 * or the first access to SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		private static final ECarManager INSTANCE = new ECarManager();
	}

	public static synchronized ECarManager getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setParkName(String pname){
		parkName = pname;
	}
	
	public String getParkName(){
		return parkName;
	}
	
	public ParkClient getPark(String parkId) throws NoParkFoundException, InitParkFault_Exception {

		Collection<String> parks = this.getParks();
		String uddiUrl = ECarManager.getInstance().getUddiURL();
		
		for (String park : parks) {
			try {
				ParkClient parkClient = new ParkClient(uddiUrl, park);
				ParkInfo info = parkClient.getInfo();
				String id2 = info.getId();
				if (id2.equals(parkId)) {
					return parkClient;
				}
			} catch (ParkClientException e) {
				continue;
			}
		}
		
		throw new NoParkFoundException();
	}
	
	
	
	public String getUddiURL() {
		// TODO Auto-generated method stub
		return uddiURL;
	}

	public Collection<String> getParks() {
		Collection<UDDIRecord> records = null;
		Collection<String> parks = new ArrayList<String>();
		try {
			UDDINaming uddi = new UDDINaming(uddiURL);
			
			records = uddi.listRecords(parkName + "%");
			for (UDDIRecord uR : records)
			
				parks.add(uR.getOrgName());
		}catch (UDDINamingException e) {
		
		
		}
		return parks;
	}
	

	public ECarUser creatNewUser(String userEmail) throws UserExistsException, InvalidEmailException{
		return ECarUsersManager.getInstance().RegisterNewECarUser(userEmail);
	}

	public void rentCar(String parkId, String userEmail) throws NoUserFoundException, InsufficientCreditFault_Exception, UserAlreadyHasCarFault_Exception, NoParkFoundException, NoCarAvailableFault_Exception, UserHasNoCarException, InitParkFault_Exception {
		// TODO Auto-generated method stub
		ECarUser eCUser = getUser(userEmail);
		synchronized (eCUser) {
			//validate user can rent
			eCUser.validateCanRentCar();

			//validate station can rent
			ParkClient parkC = getPark(parkId);
			parkC.getStats();
			
			//apply rent action to user
			eCUser.effectiveRent();
		}
	}

	public ECarUser getUser(String userEmail) throws NoUserFoundException{
		// TODO Auto-generated method stub
		return ECarUsersManager.getInstance().getUser(userEmail);
	}

	public void returnPark(String parkId, String userEmail) throws NoUserFoundException, ParkFullFault_Exception, UserHasNoCarException, NoParkFoundException, NoSpaceFault_Exception, CarNotRentedFault_Exception, InitParkFault_Exception {
		ECarUser eCUser = getUser(userEmail);
		synchronized (eCUser) {
			//validate user can rent
			eCUser.validateCanReturnBina();
			
			//validate station can rent
			ParkClient parkC = getPark(parkId);
			int prize = parkC.returnCar();
			
			//apply rent action to user
			eCUser.effectiveReturn(prize);
		}		
		// TODO Auto-generated method stub
		
	}

	public void reset() {
		ECarUsersManager.getInstance().reset();
		// TODO Auto-generated method stub
		
	}

	public void testInitPark(String id2, Xy coords, CoordinatesView cV, int capacity, int returnBonus) throws InitParkFault_Exception, NoParkFoundException, BadInitFault_Exception{
		//validate park can rent
		ParkClient parkC;
		try {
			parkC = getPark(id2);
			parkC.testInit(coords, capacity, returnBonus);
		} catch (InitParkFault_Exception e) {
			InitParkFault faultInfo = new InitParkFault();
			faultInfo.setMessage(e.getMessage());
			throw new InitParkFault_Exception(e.getMessage(), faultInfo);
		}		
		
	}

	public void init(int initialUserCredit) throws InitFaultException{
		if(initialUserCredit < 0) {
			throw new InitFaultException();
		}
		ECarUsersManager.getInstance().init(initialUserCredit);
		
	}

}
