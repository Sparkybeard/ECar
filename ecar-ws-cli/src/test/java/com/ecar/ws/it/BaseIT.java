package com.ecar.ws.it;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

import com.ecar.ws.cli.ECarClient;

import com.ecar.ws.*;

import pt.ulisboa.tecnico.sdis.ws.uddi.UDDINaming;
import pt.ulisboa.tecnico.sdis.ws.uddi.UDDINamingException;
import pt.ulisboa.tecnico.sdis.ws.uddi.UDDIRecord;

import org.junit.AfterClass;
import org.junit.BeforeClass;


/*
 * Base class of tests
 * Loads the properties in the file
 */
public class BaseIT {

	private static final String TEST_PROP_FILE = "/test.properties";
	protected static Properties testProps;
	
	protected static final String VALID_USER = "sd.test@tecnico.ulisboa";
	protected static String carsClearParks;
	protected static String parkBaseName;
	
	private static String uddiURL;
	
	protected static ECarClient client;

	@BeforeClass
	public static void oneTimeSetup() throws Exception {
		testProps = new Properties();
		try {
			testProps.load(BaseIT.class.getResourceAsStream(TEST_PROP_FILE));
			System.out.println("Loaded test properties:");
			System.out.println(testProps);
		} catch (IOException e) {
			final String msg = String.format("Could not load properties file {}", TEST_PROP_FILE);
			System.out.println(msg);
			throw e;
		}

		final String uddiEnabled = testProps.getProperty("uddi.enabled");
		final String verboseEnabled = testProps.getProperty("verbose.enabled");

		final String uddiURL = testProps.getProperty("uddi.url");
		final String wsName = testProps.getProperty("ws.name");
		final String wsURL = testProps.getProperty("ws.url");

		carsClearParks = testProps.getProperty("clear.parks.enabled");
		
		if ("true".equalsIgnoreCase(uddiEnabled)) {
			client = new ECarClient(uddiURL, wsName);
		} else {
			client = new ECarClient(wsURL);
		}
		client.setVerbose("true".equalsIgnoreCase(verboseEnabled));

	}

	@AfterClass
	public static void cleanup() {
	}

	
}
	

