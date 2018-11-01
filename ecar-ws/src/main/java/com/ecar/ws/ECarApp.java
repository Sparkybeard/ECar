package com.ecar.ws;

import com.ecar.domain.ECarManager;


public class ECarApp {

	public static void main(String[] args) throws Exception {

		System.out.println();
		System.out.println(ECarApp.class.getSimpleName() + " running");
		System.out.println();

		for (int index = 0; index < args.length; ++index) {
            System.out.println("args[" + index + "]: " + args[index]);
        }
		
		String uddiURL = null;
		String wsName = null;
		String wsURL = null;
		
		
		// Create server implementation object, according to options
		ECarEndpointManager endpoint = null;
		if (args.length == 1) {
			wsURL = args[0];
			endpoint = new ECarEndpointManager(wsURL);
			ECarManager.getInstance().setId(wsURL);

		} else if (args.length >= 3) {
			uddiURL = args[0];
			wsName = args[1];
			wsURL = args[2];
			endpoint = new ECarEndpointManager(uddiURL, wsName, wsURL);
			endpoint.setVerbose(true);
			ECarManager.getInstance().setId(wsName);
		}

		try {
			endpoint.start();
			endpoint.awaitConnections();
		} finally {
			endpoint.stop();
		}
	}

}