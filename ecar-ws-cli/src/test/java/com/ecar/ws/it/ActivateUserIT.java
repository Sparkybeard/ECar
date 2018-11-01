package com.ecar.ws.it;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ecar.ws.EmailAlreadyExistsFault_Exception;
import com.ecar.ws.InitFault_Exception;
import com.ecar.ws.InvalidEmailFault_Exception;
import com.ecar.ws.InvalidUserFault_Exception;

public class ActivateUserIT extends BaseIT  {
	/*
	 * Class tests if the user creation has succeeded or not
	 */
	
		private static final int USER_POINTS = 10;

	

		// members

		// initialization and clean-up for each test
		@Before
		public void setUp() throws InitFault_Exception {
			client.testInit(USER_POINTS);
		}

		

		@Test
		public void createUserValidTest() throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception, InvalidUserFault_Exception{
			client.activateUser(VALID_USER);
			assertEquals(USER_POINTS, client.getCredit(VALID_USER));
		}
			 
		@Test
		public void createUserValidTest2() throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception, InvalidUserFault_Exception {
			String email = new String("sd.teste@tecnico");
			client.activateUser(email);
			assertEquals(USER_POINTS, client.getCredit(email));
		}
		
		@Test
		public void createUserValidTest3() throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception, InvalidUserFault_Exception {
			String email = new String("sd@tecnico");
			client.activateUser(email);
			assertEquals(USER_POINTS, client.getCredit(email));
		}
		 
		 
		/*
		 * Tries to create to users with the same name, which should throw an exception
		 */
		@Test(expected = EmailAlreadyExistsFault_Exception.class)
		public void createUserDuplicateTest() throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {
			client.activateUser(VALID_USER);
			client.activateUser(VALID_USER);
		}

		/*
		 * Tries to create a user with an invalid email
		 * Should throw InvalidEmailFault_Exception
		 */
		@Test(expected = InvalidEmailFault_Exception.class)
		public void createUserInvalidEmailFaultTest1() throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {
			String email = new String("@tecnico.ulisboa");
			client.activateUser(email);			
		}
		 
		/*
		 * Tries to create a user with an invalid email
		 * Should throw InvalidEmailFault_Exception
		 */
		@Test(expected = InvalidEmailFault_Exception.class)
		public void createUserInvalidEmailFaultTest2() throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {
			String email = new String("teste");
			client.activateUser(email);			
		}
		 

		/*
		 * Tries to create a user with an invalid email
		 * Should throw InvalidEmailFault_Exception
		 */
		@Test(expected = InvalidEmailFault_Exception.class)
		public void createUserInvalidEmailFaultTest3() throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {
			String email = new String("teste@tecnico.");
			client.activateUser(email);			
		}
		 
		
		/*
		 * Tries to create a user with an invalid email
		 * Should throw InvalidEmailFault_Exception
		 */
		@Test(expected = InvalidEmailFault_Exception.class)
		public void createUserInvalidEmailFaultTest4() throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {
			String email = new String("sd.@tecnico");
			client.activateUser(email);			
		}
		
		@Test(expected = InvalidEmailFault_Exception.class)
		public void createUserInvalidEmailFaultTest5() throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {
			client.activateUser(null);			
		}
		
		@After
		public void tearDown() {
		client.testClear();
		}
}
