package com.ecar.ws.cli;

public class ECarClientApp {

    public static void main(String[] args) throws Exception {
        // Check arguments
        if (args.length == 0) {
            System.err.println("Argument(s) missing!");
            System.err.println("Usage: java " + ECarClientApp.class.getName()
                    + " wsURL OR uddiURL wsName");
            return;
        }
        String uddiURL = null;
        String wsName = null;
        String wsURL = null;
        if (args.length == 1) {
            wsURL = args[0];
        } else if (args.length >= 2) {
            uddiURL = args[0];
            wsName = args[1];
        }

		System.out.println();
		System.out.println(ECarClientApp.class.getSimpleName() + " running");
		System.out.println();

		for (int index = 0; index < args.length; ++index) {
            System.out.println("args[" + index + "]: " + args[index]);
        }
		
        // Create client
		ECarClient ecclient= null;
		
		if (wsURL != null){
			System.out.printf("Creating client for server at %s %n", wsURL);
			ecclient = new ECarClient(wsURL);
		}
		else if(uddiURL != null){
			System.out.printf("Creating client using UDDI at %s for server %s %n", uddiURL, wsName);
			ecclient = new ECarClient(wsURL);
		}
		// TODO
		System.out.println("Invoking testPing()");
		String pingResult = ecclient.testPing("Client");
		System.out.printf(pingResult);
	}
}

