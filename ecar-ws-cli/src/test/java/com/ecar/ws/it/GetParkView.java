package com.ecar.ws.it;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.ecar.ws.*;
import org.junit.*;


public class GetParkView extends BaseIT  {
	private final static int X1 = 5;
	private final static int Y1 = 5;
	private final static int X2 = 5;
	private final static int Y2 = 5;
	private final static int X3 = 5;
	private final static int Y3 = 5;
	private final static int CAPACITY = 20;
	private final static int RETURN_PRIZE = 0;
	
	// one-time initialization and clean-up


	// members

	// initialization and clean-up for each test
	@Before
	public void setUp() throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {
	client.activateUser(VALID_USER);
	client.testInitPark(initialParkState);
	
	}

	

			
			 
	// tests
		
	@Test
    public void getInfoParkSingleValidTest() throws InvalidParkFault_Exception {
        ParkView view = client.getParkView(parkBaseName + "1");
	 	
		assertNotNull(view);
		assertEquals(CAPACITY, view.getAvailableCars());
		assertEquals(CAPACITY, view.getCapacity());
		assertEquals(X1, view.getCoords().getX().intValue());
		assertEquals(Y1, view.getCoords().getY().intValue());
		assertEquals(0, view.getFreeSpaces());
		assertEquals(0, view.getReturnBonus());
		assertEquals(0, view.getCountReturns());
		assertEquals(parkBaseName + "1", view.getId());
    }
	
	@Test
    public void getInfoParkAllValidTest() throws InvalidParkFault_Exception {
        ParkView view1 = client.getParkView(parkBaseName + "1");
        ParkView view2 = client.getParkView(parkBaseName + "2");
        ParkView view3 = client.getParkView(parkBaseName + "3");
	 	
        assertEquals(X1, view1.getCoords().getX().intValue());
		assertEquals(Y1, view1.getCoords().getY().intValue());
		assertEquals(X2, view2.getCoords().getX().intValue());
		assertEquals(Y2, view2.getCoords().getY().intValue());
		assertEquals(X3, view3.getCoords().getX().intValue());
		assertEquals(Y3, view3.getCoords().getY().intValue());
        
    }
	 
	 
	@Test(expected = InvalidParkFault_Exception.class)
	public void getInfoParkUnknownTest() throws InvalidParkFault_Exception {
		client.getParkView("Unknown");
	}
	
	@Test(expected = InvalidParkFault_Exception.class)
	public void getInfoParkNullTest() throws InvalidParkFault_Exception {
		client.getParkView(null);
	}
		 
	@After
	public void tearDown() {
	client.testClear();
	}
}