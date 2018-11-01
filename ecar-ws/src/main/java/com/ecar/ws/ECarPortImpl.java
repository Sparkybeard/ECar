package com.ecar.ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.jws.WebService;

import com.ecar.domain.ECarManager;
import com.ecar.domain.ECarUser;
import com.ecar.domain.ParksComparator;
import com.ecar.domain.exception.InitFaultException;
import com.ecar.domain.exception.InvalidEmailException;
import com.ecar.domain.exception.NoParkFoundException;
import com.ecar.domain.exception.NoUserFoundException;
import com.ecar.domain.exception.UserExistsException;
import com.ecar.domain.exception.UserHasNoCarException;
import com.ecar.park.ws.NoSpaceFault_Exception;
import com.ecar.park.ws.ParkInfo;
import com.ecar.park.ws.Xy;
import com.ecar.park.ws.cli.ParkClient;
import com.ecar.park.ws.cli.ParkClientException;

import pt.ulisboa.tecnico.sdis.ws.uddi.UDDINaming;
import pt.ulisboa.tecnico.sdis.ws.uddi.UDDINamingException;



@WebService(endpointInterface = "com.ecar.ws.ECarPortType",
wsdlLocation = "ECarService.wsdl",
name ="ECarWebService",
portName = "ECarPort",
targetNamespace="http://ws.ecar.com/",
serviceName = "ECarService"
)

public class ECarPortImpl implements ECarPortType {

	private ECarEndpointManager endpointManager;

public ECarPortImpl(ECarEndpointManager eCarEndpoinManager) {
	this.endpointManager = endpointManager;
	}

@Override
public CarView rentCar(String parkId, String userEmail)
		throws InsufficientCreditFault_Exception, InvalidParkFault_Exception, InvalidUserFault_Exception,
		NoCarAvailableFault_Exception, UserAlreadyHasCarFault_Exception ,
NoCarAvailableFault_Exception, UserHasNoCarException, InitParkFault_Exception {
		
		try {
			ECarManager.getInstance().rentCar(parkId,userEmail);
		} catch (NoUserFoundException e) {
			throwInvalidUser("User "+ userEmail+ " is invalid" );
		} catch (InsufficientCreditFault_Exception e) {
			throwInsufficientCredit("User has insufficient credits: " + userEmail);
		} catch (UserAlreadyHasCarFault_Exception e) {
			throwAlreadyHasCar("User has car: " + userEmail);
		} catch (NoParkFoundException e) {
			throwInvalidPark("Park with ID: " + parkId + "is invalid");
		} catch (NoCarAvailableFault_Exception e) {
			throwNoECarAvail("Park has no Car available: " + parkId);
		}
		
		return null;
	}



private void throwNoECarAvail(String msg) throws NoCarAvailableFault_Exception {
	NoCarAvailableFault faultInfo = new NoCarAvailableFault();
	faultInfo.setMessage(msg);
	throw new NoCarAvailableFault_Exception(msg, faultInfo);
	// TODO Auto-generated method stub
	
}

private void throwAlreadyHasCar(String msg) throws UserAlreadyHasCarFault_Exception {
	UserAlreadyHasCarFault faultInfo = new UserAlreadyHasCarFault();
	faultInfo.setMessage(msg);
	throw new UserAlreadyHasCarFault_Exception(msg, faultInfo);
	// TODO Auto-generated method stub
	
}

private void throwInsufficientCredit(String msg) throws InsufficientCreditFault_Exception{
	InsufficientCreditFault faultInfo = new InsufficientCreditFault();
	faultInfo.setMessage(msg);
	throw new InsufficientCreditFault_Exception(msg, faultInfo);
	// TODO Auto-generated method stub
	
}

private void throwInvalidUser(String msg) throws InvalidUserFault_Exception {
	InvalidUserFault faultInfo = new InvalidUserFault();
	faultInfo.setMessage(msg);
	throw new InvalidUserFault_Exception(msg, faultInfo);
}
	// TODO Auto-generated method stub
	

@Override
public void returnCar(String parkId, String userEmail) throws CarNotRentedFault_Exception, InvalidParkFault_Exception,
		InvalidUserFault_Exception, ParkFullFault_Exception, UserHasNoCarException, NoSpaceFault_Exception, InitParkFault_Exception {
	try {
		ECarManager.getInstance().returnPark(parkId,userEmail);
	} catch (NoUserFoundException e) {
		throwInvalidUser("User "+ userEmail+ " is invalid" );
	} catch (ParkFullFault_Exception e) {
		throwFullPark("Park has NO spaces available: " + parkId);
	} catch (CarNotRentedFault_Exception e) {
		throwNoCarRented("Car not rented by: " + userEmail);
	} catch (NoParkFoundException e) {
		throwInvalidPark("Park with ID: " + parkId + "is invalid");
	}
	
}

private void throwNoCarRented(String msg) throws CarNotRentedFault_Exception {
	// TODO Auto-generated method stub
	CarNotRentedFault faultInfo = new CarNotRentedFault();
	faultInfo.setMessage(msg);
	throw new CarNotRentedFault_Exception(msg, faultInfo);
}

private void throwFullPark(String msg) throws ParkFullFault_Exception {
		// TODO Auto-generated method stub
	ParkFullFault faultInfo = new ParkFullFault();
	faultInfo.setMessage(msg);
	throw new ParkFullFault_Exception(msg, faultInfo);
	}

@Override
public String testPing(String input) {
	//String parkC = null;
	Collection<String> parks = null;
	StringBuilder builder = new StringBuilder();
	final String EOL = String.format("%n");
	
	// If no input is received, return a default name.
	if (input == null || input.trim().length() == 0)
	input = "friend";

	// If the park does not have a name, return a default.
	String wsName = endpointManager.getWsName();
	if (wsName == null || wsName.trim().length() == 0)
	wsName = "Park";
	
	builder.append("Hello ").append(input);
	builder.append(" from ").append(endpointManager.getWsName());
	builder.append("!");
	builder.append(EOL);
	
	
	try{
		UDDINaming uddiNaming = endpointManager.getUddiNaming();
		parks = uddiNaming.list(ECarManager.getInstance().getParkName()+"%");
		builder.append("Found ").append(parks.size());
		builder.append(" parks on UDDI.");
		builder.append(EOL);
	
	}catch(UDDINamingException e){
		builder.append("Failed to contact UDDI");
		builder.append(EOL);
		builder.append(e.getMessage()).append(" - ").append(e.getClass().getName());
		builder.append(EOL);
		return builder.toString();
	};
	
	for (String parkC : parks){
		builder.append("Ping at ").append(parkC).append(":");
		builder.append(EOL);
		
	try{
		ParkClient client = new ParkClient(parkC);
		builder.append(client.testPing(endpointManager.getWsName()));
	}catch(Exception e){
		builder.append(e.getMessage()).append(" - ").append(e.getClass().getName());

	}
	builder.append(EOL);
}
	return builder.toString();
}

@Override
public int getCredit(String userEmail) throws InvalidUserFault_Exception {
	try {
		ECarUser eCUser = ECarManager.getInstance().getUser(userEmail);	
		return eCUser.getCredit();
	} catch (NoUserFoundException e) {
		throwInvalidUser("User "+ userEmail+ " is invalid" );
	}
	return 0;
}

@Override
public List<ParkView> getNearbyParks(Integer maxNrParks, CoordinatesView userCoords) {
		List<ParkView> parkViews = new ArrayList<ParkView>();
		Collection<String> parks = ECarManager.getInstance().getParks();
		String uddiUrl = ECarManager.getInstance().getUddiURL();
		ParkClient parkClient = null;
		ParkInfo info = null;
		
		if(maxNrParks <= 0 || userCoords == null)
			return parkViews;
		
		for (String park : parks) {
			try {
				parkClient = new ParkClient(uddiUrl, park);
				info = parkClient.getInfo();
				parkViews.add(newParkView(info));
			} catch(ParkClientException e) {
				continue;
			}
		}
		Collections.sort(parkViews, new ParksComparator(userCoords));
		
		if(maxNrParks > parkViews.size())
			return parkViews;
		else
			return parkViews.subList(0, maxNrParks);
	}


@Override
public void testClear() {
	//Reset Cars
			ECarManager.getInstance().reset();

			//Reset All parks
			Collection<String> parks = ECarManager.getInstance().getParks();
			String uddiUrl = ECarManager.getInstance().getUddiURL();
			ParkClient parkC = null;

			for (String park : parks) {
				try {
					parkC = new ParkClient(uddiUrl, park);
					parkC.testClear();
				} catch(ParkClientException e) {
					continue;
				}
			}
	
}

@Override
public void testInitPark(ParkView initialParkState) throws InitParkFault_Exception, InvalidParkFault_Exception {
		
		try {
			ECarManager.getInstance().testInitPark(initialParkState.getId(), initialParkState.getCoords(), 
					initialParkState.getCapacity(), initialParkState.getReturnBonus());
		} catch (InitParkFault_Exception e) {
			throwInitParkFault("Bad init values");
		} catch (NoParkFoundException e) {
			throwInvalidPark("Park with ID: " + initialParkState.getId() + "is invalid");
		}
	
}

private void throwInitParkFault(String msg) throws InitParkFault_Exception {
	InitParkFault faultInfo = new InitParkFault();
	faultInfo.setMessage(msg);
	throw new InitParkFault_Exception(msg, faultInfo);
}

@Override
public ParkInfo getParkView(String parkId) throws InvalidParkFault_Exception, InitParkFault_Exception {
	if(parkId == null || parkId.trim().isEmpty())
		throwInvalidPark("Parks ID cant be empty!");
	
	ParkClient parkC;
	try {
		parkC = ECarManager.getInstance().getPark(parkId);
		return newParkView(parkC.getInfo());
	} catch (NoParkFoundException e) {
		throwInvalidPark("Park with ID: " + parkId + "is invalid");
		return null;
	}
	
}

private ParkInfo newParkView(ParkInfo info) {
	
		ParkInfo infoReturned = new ParkInfo();
		Xy coordinates = new Xy();
		coordinates.setX(info.getCoords().getX());
		coordinates.setY(info.getCoords().getY());
		
		infoReturned.setCapacity(info.getCapacity());
		infoReturned.setCoords(coordinates);
		infoReturned.setAvailableCars(info.getAvailableCars());
		infoReturned.setFreeSpaces(info.getFreeSpaces());
		infoReturned.setId(info.getId());
		infoReturned.setReturnBonus(info.getReturnBonus());
		return infoReturned;
}

private void throwInvalidPark(String msg) throws InvalidParkFault_Exception{
	InvalidParkFault faultInfo = new InvalidParkFault();
	faultInfo.setMessage(msg);
	throw new InvalidParkFault_Exception(msg, faultInfo);
}// TODO Auto-generated method stub
	


@Override
public void testInit(int initialUserCredit) throws InitFault_Exception, InitFaultException {
	try {
		ECarManager.getInstance().init(initialUserCredit);
	} catch (InitFaultException e) {
		throwInitFault("Bad init values: " + initialUserCredit);
	}	
}

private void throwInitFault(String msg) throws InitFault_Exception {
	InitFault faultInfo = new InitFault();
	faultInfo.setMessage(msg);
	throw new InitFault_Exception(msg, faultInfo);	
}

@Override
public UserView activateUser(String userEmail) throws EmailAlreadyExistsFault_Exception, InvalidEmailFault_Exception {
	try{
		ECarUser eCUser = ECarManager.getInstance().creatNewUser(userEmail);
	
		UserView userView = new UserView();
		userView.setUserEmail(eCUser.getEmail());
		userView.setCredit(eCUser.getCredit());
		userView.setHasCar(eCUser.getHasCar());
		return userView;
	}catch(UserExistsException e){
		throwEmailExists("This email already exists: "+ userEmail);
	} catch (InvalidEmailException e) {
		throwInvalidEmail("Invalid email: " + userEmail);
	}
	return null;
}

private void throwInvalidEmail(String msg) throws InvalidEmailFault_Exception {
	InvalidEmailFault faultInfo = new InvalidEmailFault();
	faultInfo.setMessage(msg);
	throw new InvalidEmailFault_Exception(msg, faultInfo);
}
	
	


private void throwEmailExists(final String msg) throws EmailAlreadyExistsFault_Exception {
	EmailAlreadyExistsFault faultInfo = new EmailAlreadyExistsFault();
	faultInfo.setMessage(msg);
	throw new EmailAlreadyExistsFault_Exception(msg, faultInfo);
}
}
