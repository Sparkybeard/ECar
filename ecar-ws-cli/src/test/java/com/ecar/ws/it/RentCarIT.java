package com.ecar.ws.it;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ecar.ws.EmailAlreadyExistsFault_Exception;
import com.ecar.ws.InitFault_Exception;
import com.ecar.ws.InsufficientCreditFault_Exception;
import com.ecar.ws.InvalidEmailFault_Exception;
import com.ecar.ws.InvalidParkFault_Exception;
import com.ecar.ws.InvalidUserFault_Exception;
import com.ecar.ws.NoCarAvailableFault_Exception;
import com.ecar.ws.UserAlreadyHasCarFault_Exception;

public class RentCarIT extends BaseIT{
	private static final int USER_POINTS = 10;
	private static final String PARK_1 = parkBaseName + "1";
	
	// one-time initialization and clean-up


	// members

	// initialization and clean-up for each test
	@Before
	public void setUp() throws InitFault_Exception, InvalidEmailFault_Exception, InvalidEmailFault_Exception {
		client.testInit(USER_POINTS);
		client.testInitPark(PARK_1, /*x*/5, /*y*/5, /*capacity*/20, /*reward*/0);
		client.activateUser(VALID_USER);
	}

	
	 
	// tests
		
	/*
	 * Valid user rents Car
	 * Should not raise any Exception
	 */
	@Test
	public void rentCarValidTest() throws UserAlreadyHasCarFault_Exception, InvalidParkFault_Exception, NoCarAvailableFault_Exception, InsufficientCreditFault_Exception, InvalidUserFault_Exception, InitFault_Exception, InvalidEmailFault_Exception, InvalidEmailFault_Exception  {			         
	 	client.rentCar(PARK_1, VALID_USER);
	 	assertEquals(USER_POINTS - 1, client.getCredit(VALID_USER));
    }
	 
	 
	/*
	 * Class that exercises the fact that a User cannot rent a new Car if he already has one
	 */
	@Test(expected = UserAlreadyHasCarFault_Exception.class)
	public void rentCarUserAlreadyHasCarFaultTest() throws UserAlreadyHasCarFault_Exception, InvalidParkFault_Exception, NoCarAvailableFault_Exception, InsufficientCreditFault_Exception, InvalidUserFault_Exception, InitFault_Exception, InvalidEmailFault_Exception, InvalidEmailFault_Exception  {         
	 	client.rentCar(PARK_1, VALID_USER);
	 	client.rentCar(PARK_1, VALID_USER);
	 	
    }
	 
	 

	/*
	 * User tries to rent a Car from an InvalidStation
	 */
	@Test(expected = InvalidParkFault_Exception.class)
	public void rentCarInvalidStationTest() throws UserAlreadyHasCarFault_Exception, InvalidParkFault_Exception, NoCarAvailableFault_Exception, InsufficientCreditFault_Exception, InvalidUserFault_Exception, InitFault_Exception, InvalidEmailFault_Exception, InvalidEmailFault_Exception  {	         
	 	client.rentCar("Invalid Station", VALID_USER);
    }
	
	/*
	 * User tries to rent a Car from an InvalidStation
	 */
	@Test(expected = InvalidParkFault_Exception.class)
	public void rentCarNullStationTest() throws UserAlreadyHasCarFault_Exception, InvalidParkFault_Exception, NoCarAvailableFault_Exception, InsufficientCreditFault_Exception, InvalidUserFault_Exception, InitFault_Exception, InvalidEmailFault_Exception, InvalidEmailFault_Exception  {	         
	 	client.rentCar(null, VALID_USER);
    }
 
	 	 

	/*
	 * User tries to rent Car but there is no Car available in the station
	 * Expected to throw exception
	 */
	@Test(expected = NoCarAvailableFault_Exception.class)
	public void rentCarNoCarAvailableFaultTest() throws UserAlreadyHasCarFault_Exception, InvalidParkFault_Exception, NoCarAvailableFault_Exception, InsufficientCreditFault_Exception, InvalidUserFault_Exception, InitFault_Exception, InvalidEmailFault_Exception, InvalidEmailFault_Exception  {
		client.testInitPark(parkBaseName + "1", /*x*/5, /*y*/5, /*capacity*/0, /*reward*/10);
		client.rentCar(PARK_1, VALID_USER);	 	
    }
	 
	 	 		 
	/*
	 * User tries to rent a Car but has no credit
	 */
	@Test(expected = InsufficientCreditFault_Exception.class)
	public void rentCarInsufficientCreditFaultTest() throws UserAlreadyHasCarFault_Exception, InvalidParkFault_Exception, NoCarAvailableFault_Exception, InsufficientCreditFault_Exception, InvalidUserFault_Exception, InitFault_Exception, InvalidEmailFault_Exception, InvalidEmailFault_Exception, EmailAlreadyExistsFault_Exception  {
		client.testInit(0);
		client.activateUser(VALID_USER);
	 	client.rentCar(PARK_1, VALID_USER);
	 	
    } 		 		 
	@After
	public void tearDown() {
	client.testClear();
	}	 
}