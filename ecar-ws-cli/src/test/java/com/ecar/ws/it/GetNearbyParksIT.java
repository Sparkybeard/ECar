package com.ecar.ws.it;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.ecar.ws.*;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GetNearbyParksIT extends BaseIT {
	private final static int X1 = 1;
	private final static int Y1 = 1;
	private final static int X2 = 2;
	private final static int Y2 = 2;
	private final static int X3 = 3;
	private final static int Y3 = 3;
	private final static int CAPACITY = 20;
	private final static int RETURN_PRIZE = 0;
	private static CoordinatesView testCoords;
	
	// one-time initialization and clean-up

	

	

	// members

	// initialization and clean-up for each test
	@Before
	public void setUp() {
		client.testInitStation(parkBaseName + "1", X1, Y1, CAPACITY, RETURN_PRIZE);
		client.testInitStation(parkBaseName + "2", X2, Y2, CAPACITY, RETURN_PRIZE);
		client.testInitStation(parkBaseName + "3", X3, Y3, CAPACITY, RETURN_PRIZE); 
		testCoords = new CoordinatesView();
		testCoords.setX(0);
		testCoords.setY(0);
	}

	
		
		 
	@Test
	public void listStationsSingleTest() {
		List<ParkView> result = client.getNearbyParks(/* number of stations*/ 1, testCoords);
		ParkView view = result.get(0);
		
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals(parkBaseName + "1", view.getId());
	}
	
	@Test
	public void listStationsAllTest() {
		List<ParkView> result = client.getNearbyParks(/* number of stations*/ 3, testCoords);
		ParkView view1 = result.get(0);
		ParkView view2 = result.get(1);
		ParkView view3 = result.get(2);
		assertNotNull(result);
		assertEquals(3, result.size());
		assertEquals(parkBaseName + "1", view1.getId());
		assertEquals(parkBaseName + "2", view2.getId());
		assertEquals(parkBaseName + "3", view3.getId());
	}
	
	@Test
	public void listStationsNullTest() {
		List<ParkView> result = client.getNearbyParks(/* number of stations*/ 1, null);
		assertNotNull(result);
		assertEquals(0, result.size());
	}
	
	@Test
	public void listStationsZeroTest() {
		List<ParkView> result = client.getNearbyParks(/* number of stations*/ 0 , testCoords);
		assertNotNull(result);
		assertEquals(0, result.size());
	}
	 
	@Test
	public void listStationsFourTest() {
		List<ParkView> result = client.getNearbyParks(4, testCoords);
		assertNotNull(result);
		assertEquals(3, result.size());
	}
	 
	@After
	public void tearDown() {
		client.testClear();
	}
	
}
 