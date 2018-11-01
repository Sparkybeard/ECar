package com.ecar.ws.cli;

import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import static javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY;

import com.ecar.ws.CarNotRentedFault_Exception;
import com.ecar.ws.CarView;
import com.ecar.ws.CoordinatesView;
import com.ecar.ws.ECarPortType;
import com.ecar.ws.ECarService;
import com.ecar.ws.EmailAlreadyExistsFault_Exception;
import com.ecar.ws.InitFault_Exception;
import com.ecar.ws.InitParkFault_Exception;
import com.ecar.ws.InsufficientCreditFault_Exception;
import com.ecar.ws.InvalidEmailFault_Exception;
import com.ecar.ws.InvalidParkFault_Exception;
import com.ecar.ws.InvalidUserFault_Exception;
import com.ecar.ws.NoCarAvailableFault_Exception;
import com.ecar.ws.ParkFullFault_Exception;
import com.ecar.ws.ParkView;
import com.ecar.ws.UserAlreadyHasCarFault_Exception;
import com.ecar.ws.UserView;

import pt.ulisboa.tecnico.sdis.ws.uddi.UDDINaming;

/**
 * Client.
 *
 * Adds easier endpoint address configuration and 
 * UDDI lookup capability to the PortType generated by wsimport.
 */
public class ECarClient implements ECarPortType {

    /** WS service */
	 ECarService service = null;

    /** WS port (port type is the interface, port is the implementation) */
	ECarPortType port = null;

    /** UDDI server URL */
    private String uddiURL = null;

    /** WS name */
    private String wsName = null;

    /** WS endpoint address */
    private String wsURL = null; // default value is defined inside WSDL

    public String getWsURL() {
        return wsURL;
    }

    /** output option **/
    private boolean verbose = false;

    public boolean isVerbose() {
        return verbose;
    }

    public void setVerbose(boolean verbose) {
        this.verbose = verbose;
    }

    /** constructor with provided web service URL */
    public ECarClient(String wsURL) throws ECarClientException {
        this.wsURL = wsURL;
        createStub();
    }

    /** constructor with provided UDDI location and name */
    public ECarClient(String uddiURL, String wsName) throws ECarClientException {
        this.uddiURL = uddiURL;
        this.wsName = wsName;
        uddiLookup();
        createStub();
    }

    /** UDDI lookup */
    private void uddiLookup() throws ECarClientException {
    	 try {
             if (verbose)
                 System.out.printf("Contacting UDDI at %s%n", uddiURL);
             UDDINaming uddiNaming = new UDDINaming(uddiURL);

             if (verbose)
                 System.out.printf("Looking for '%s'%n", wsName);
             wsURL = uddiNaming.lookup(wsName);

         } catch (Exception e) {
             String msg = String.format("Client failed lookup on UDDI at %s!",
                     uddiURL);
             throw new ECarClientException(msg, e);
         }

         if (wsURL == null) {
             String msg = String.format(
                     "Service with name %s not found on UDDI at %s", wsName,
                     uddiURL);
             throw new ECarClientException(msg);
         }
    }

    /** Stub creation and configuration */
    private void createStub() {
    	if (verbose)
            System.out.println("Creating stub ...");
        service = new ECarService();
        port = service.getECarPort();

        if (wsURL != null) {
            if (verbose)
                System.out.println("Setting endpoint address ...");
            BindingProvider bindingProvider = (BindingProvider) port;
            Map<String, Object> requestContext = bindingProvider
                    .getRequestContext();
            requestContext.put(ENDPOINT_ADDRESS_PROPERTY, wsURL);
        }
    }

	@Override
	public CarView rentCar(String parkId, String userEmail)
			throws InsufficientCreditFault_Exception, InvalidParkFault_Exception, InvalidUserFault_Exception,
			NoCarAvailableFault_Exception, UserAlreadyHasCarFault_Exception {
		return port.rentCar(parkId, userEmail);
	}

	@Override
	public void returnCar(String parkId, String userEmail) throws CarNotRentedFault_Exception,
			InvalidParkFault_Exception, InvalidUserFault_Exception, ParkFullFault_Exception {
		port.returnCar(parkId,userEmail);
		
	}

	@Override
	public String testPing(String input) {
		
		return port.testPing(input);
	}

	@Override
	public int getCredit(String userEmail) throws InvalidUserFault_Exception {
		return port.getCredit(userEmail);
	}

	@Override
	public List<ParkView> getNearbyParks(Integer maxNrParks, CoordinatesView userCoords) {
		return port.getNearbyParks(maxNrParks,userCoords);
	}

	@Override
	public void testClear() {
		port.testClear();
		
	}

	@Override
	public void testInitPark(ParkView initialParkState) throws InitParkFault_Exception {
		port.testInitPark(initialParkState);
		
	}

	@Override
	public ParkView getParkView(String parkId) throws InvalidParkFault_Exception {
		return port.getParkView(parkId);
	}

	@Override
	public void testInit(int initialUserCredit) throws InitFault_Exception {
		port.testInit(initialUserCredit);
	}

	@Override
	public UserView activateUser(String userEmail)
			throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {
		return port.activateUser(userEmail);
	}


}   