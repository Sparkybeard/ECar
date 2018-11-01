package com.ecar.ws.it;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ecar.ws.CarNotRentedFault_Exception;
import com.ecar.ws.EmailAlreadyExistsFault_Exception;
import com.ecar.ws.InitFault_Exception;
import com.ecar.ws.InsufficientCreditFault_Exception;
import com.ecar.ws.InvalidEmailFault_Exception;
import com.ecar.ws.InvalidParkFault_Exception;
import com.ecar.ws.InvalidUserFault_Exception;
import com.ecar.ws.NoCarAvailableFault_Exception;
import com.ecar.ws.ParkFullFault_Exception;
import com.ecar.ws.UserAlreadyHasCarFault_Exception;


public class ReturnCarIT extends BaseIT {
	
	private static final int USER_POINTS = 10;
	private static final int PARK_REWARD = 10;
	private static final String PARK_1 = parkBaseName + "1";

	// one-time initialization and clean-up
	@BeforeClass
	public static void oneTimeSetUp() throws InitFault_Exception {
	}

	@AfterClass
	public static void oneTimeTearDown() {
	}

	// members

	// initialization and clean-up for each test
	@Before
	public void setUp() throws InitFault_Exception, EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {
		client.testInit(USER_POINTS);
		client.testInitPark(PARK_1, /*x*/5, /*y*/5, /*capacity*/20, /*reward*/PARK_REWARD);
		client.activateUser(VALID_USER);
	}

	


	// tests
		
	@Test
	public void returnCarOkTest() throws UserAlreadyHasCarFault_Exception, InvalidParkFault_Exception, NoCarAvailableFault_Exception, InsufficientCreditFault_Exception, InvalidUserFault_Exception, ParkFullFault_Exception, CarNotRentedFault_Exception {
		client.rentCar(PARK_1, VALID_USER);
		client.returnCar(PARK_1, VALID_USER);
		int credit = client.getCredit(VALID_USER);
		assertEquals(USER_POINTS - 1 + PARK_REWARD, credit);
	}
		 
		 

	@Test(expected = CarNotRentedFault_Exception.class)
	public void returnCarCarNotRentedFaultTest() throws ParkFullFault_Exception, InvalidParkFault_Exception, CarNotRentedFault_Exception, InvalidUserFault_Exception, EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception, UserAlreadyHasCarFault_Exception, NoCarAvailableFault_Exception, InsufficientCreditFault_Exception   {
		final String USER_2 = "sd.teste2@tecnico.ulisboa";
		client.activateUser(USER_2);
		
		/* Rent with another user first to avoid FullStation Exception */
		client.rentCar(PARK_1, USER_2);
		client.returnCar(PARK_1, VALID_USER);
	}
		 
		 

	@Test(expected = InvalidUserFault_Exception.class)
	public void returnCarInvalidUserFaultTest() throws ParkFullFault_Exception, InvalidParkFault_Exception, CarNotRentedFault_Exception, InvalidUserFault_Exception, EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception, UserAlreadyHasCarFault_Exception, NoCarAvailableFault_Exception, InsufficientCreditFault_Exception   {
		final String USER_2 = "sd.teste2@tecnico.ulisboa";
		final String USER_3 = "sd.teste3@tecnico.ulisboa";
		
		client.activateUser(USER_2);
		
		/* Rent with another user first to avoid FullStation Exception */
		client.rentCar(PARK_1, USER_2);
						 	 
		client.returnCar(PARK_1, USER_3);
	}
		 
		 	 


	@Test(expected = ParkFullFault_Exception.class)
	public void returnCarNoSlotAvailTest() throws InitFault_Exception, UserAlreadyHasCarFault_Exception, InvalidParkFault_Exception, NoCarAvailableFault_Exception, InsufficientCreditFault_Exception, InvalidUserFault_Exception, ParkFullFault_Exception, CarNotRentedFault_Exception {
		final String PARK_2 = parkBaseName + "2";
		client.testInitPark(PARK_2, /*x*/5, /*y*/5, /*capacity*/20, /*reward*/PARK_REWARD);
			         
		client.rentCar(PARK_1, VALID_USER);				 	 
		client.returnCar(PARK_2, VALID_USER);
		 	
	 }

	@After
	public void tearDown() {
	client.testClear();
	}
}