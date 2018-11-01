
package com.ecar.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ecar.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TestPingResponse_QNAME = new QName("http://ws.ecar.com/", "testPingResponse");
    private final static QName _UserAlreadyHasCarFault_QNAME = new QName("http://ws.ecar.com/", "UserAlreadyHasCarFault");
    private final static QName _TestInit_QNAME = new QName("http://ws.ecar.com/", "testInit");
    private final static QName _NoCarAvailableFault_QNAME = new QName("http://ws.ecar.com/", "NoCarAvailableFault");
    private final static QName _GetParkViewResponse_QNAME = new QName("http://ws.ecar.com/", "getParkViewResponse");
    private final static QName _GetNearbyParks_QNAME = new QName("http://ws.ecar.com/", "getNearbyParks");
    private final static QName _TestInitResponse_QNAME = new QName("http://ws.ecar.com/", "testInitResponse");
    private final static QName _InitParkFault_QNAME = new QName("http://ws.ecar.com/", "InitParkFault");
    private final static QName _ActivateUserResponse_QNAME = new QName("http://ws.ecar.com/", "activateUserResponse");
    private final static QName _InvalidUserFault_QNAME = new QName("http://ws.ecar.com/", "InvalidUserFault");
    private final static QName _InitFault_QNAME = new QName("http://ws.ecar.com/", "InitFault");
    private final static QName _TestInitParkResponse_QNAME = new QName("http://ws.ecar.com/", "testInitParkResponse");
    private final static QName _RentCar_QNAME = new QName("http://ws.ecar.com/", "rentCar");
    private final static QName _RentCarResponse_QNAME = new QName("http://ws.ecar.com/", "rentCarResponse");
    private final static QName _ReturnCar_QNAME = new QName("http://ws.ecar.com/", "returnCar");
    private final static QName _ReturnCarResponse_QNAME = new QName("http://ws.ecar.com/", "returnCarResponse");
    private final static QName _TestPing_QNAME = new QName("http://ws.ecar.com/", "testPing");
    private final static QName _GetNearbyParksResponse_QNAME = new QName("http://ws.ecar.com/", "getNearbyParksResponse");
    private final static QName _GetCreditResponse_QNAME = new QName("http://ws.ecar.com/", "getCreditResponse");
    private final static QName _TestClear_QNAME = new QName("http://ws.ecar.com/", "testClear");
    private final static QName _GetParkView_QNAME = new QName("http://ws.ecar.com/", "getParkView");
    private final static QName _ParkFullFault_QNAME = new QName("http://ws.ecar.com/", "ParkFullFault");
    private final static QName _InvalidParkFault_QNAME = new QName("http://ws.ecar.com/", "InvalidParkFault");
    private final static QName _TestClearResponse_QNAME = new QName("http://ws.ecar.com/", "testClearResponse");
    private final static QName _CarNotRentedFault_QNAME = new QName("http://ws.ecar.com/", "CarNotRentedFault");
    private final static QName _ActivateUser_QNAME = new QName("http://ws.ecar.com/", "activateUser");
    private final static QName _GetCredit_QNAME = new QName("http://ws.ecar.com/", "getCredit");
    private final static QName _InsufficientCreditFault_QNAME = new QName("http://ws.ecar.com/", "InsufficientCreditFault");
    private final static QName _TestInitPark_QNAME = new QName("http://ws.ecar.com/", "testInitPark");
    private final static QName _EmailAlreadyExistsFault_QNAME = new QName("http://ws.ecar.com/", "EmailAlreadyExistsFault");
    private final static QName _InvalidEmailFault_QNAME = new QName("http://ws.ecar.com/", "InvalidEmailFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ecar.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestClear }
     * 
     */
    public TestClear createTestClear() {
        return new TestClear();
    }

    /**
     * Create an instance of {@link GetCreditResponse }
     * 
     */
    public GetCreditResponse createGetCreditResponse() {
        return new GetCreditResponse();
    }

    /**
     * Create an instance of {@link GetNearbyParksResponse }
     * 
     */
    public GetNearbyParksResponse createGetNearbyParksResponse() {
        return new GetNearbyParksResponse();
    }

    /**
     * Create an instance of {@link RentCarResponse }
     * 
     */
    public RentCarResponse createRentCarResponse() {
        return new RentCarResponse();
    }

    /**
     * Create an instance of {@link ReturnCar }
     * 
     */
    public ReturnCar createReturnCar() {
        return new ReturnCar();
    }

    /**
     * Create an instance of {@link ReturnCarResponse }
     * 
     */
    public ReturnCarResponse createReturnCarResponse() {
        return new ReturnCarResponse();
    }

    /**
     * Create an instance of {@link TestPing }
     * 
     */
    public TestPing createTestPing() {
        return new TestPing();
    }

    /**
     * Create an instance of {@link InvalidParkFault }
     * 
     */
    public InvalidParkFault createInvalidParkFault() {
        return new InvalidParkFault();
    }

    /**
     * Create an instance of {@link ParkFullFault }
     * 
     */
    public ParkFullFault createParkFullFault() {
        return new ParkFullFault();
    }

    /**
     * Create an instance of {@link GetParkView }
     * 
     */
    public GetParkView createGetParkView() {
        return new GetParkView();
    }

    /**
     * Create an instance of {@link GetCredit }
     * 
     */
    public GetCredit createGetCredit() {
        return new GetCredit();
    }

    /**
     * Create an instance of {@link ActivateUser }
     * 
     */
    public ActivateUser createActivateUser() {
        return new ActivateUser();
    }

    /**
     * Create an instance of {@link CarNotRentedFault }
     * 
     */
    public CarNotRentedFault createCarNotRentedFault() {
        return new CarNotRentedFault();
    }

    /**
     * Create an instance of {@link TestClearResponse }
     * 
     */
    public TestClearResponse createTestClearResponse() {
        return new TestClearResponse();
    }

    /**
     * Create an instance of {@link EmailAlreadyExistsFault }
     * 
     */
    public EmailAlreadyExistsFault createEmailAlreadyExistsFault() {
        return new EmailAlreadyExistsFault();
    }

    /**
     * Create an instance of {@link InvalidEmailFault }
     * 
     */
    public InvalidEmailFault createInvalidEmailFault() {
        return new InvalidEmailFault();
    }

    /**
     * Create an instance of {@link InsufficientCreditFault }
     * 
     */
    public InsufficientCreditFault createInsufficientCreditFault() {
        return new InsufficientCreditFault();
    }

    /**
     * Create an instance of {@link TestInitPark }
     * 
     */
    public TestInitPark createTestInitPark() {
        return new TestInitPark();
    }

    /**
     * Create an instance of {@link NoCarAvailableFault }
     * 
     */
    public NoCarAvailableFault createNoCarAvailableFault() {
        return new NoCarAvailableFault();
    }

    /**
     * Create an instance of {@link TestInit }
     * 
     */
    public TestInit createTestInit() {
        return new TestInit();
    }

    /**
     * Create an instance of {@link UserAlreadyHasCarFault }
     * 
     */
    public UserAlreadyHasCarFault createUserAlreadyHasCarFault() {
        return new UserAlreadyHasCarFault();
    }

    /**
     * Create an instance of {@link TestPingResponse }
     * 
     */
    public TestPingResponse createTestPingResponse() {
        return new TestPingResponse();
    }

    /**
     * Create an instance of {@link InitParkFault }
     * 
     */
    public InitParkFault createInitParkFault() {
        return new InitParkFault();
    }

    /**
     * Create an instance of {@link TestInitResponse }
     * 
     */
    public TestInitResponse createTestInitResponse() {
        return new TestInitResponse();
    }

    /**
     * Create an instance of {@link GetNearbyParks }
     * 
     */
    public GetNearbyParks createGetNearbyParks() {
        return new GetNearbyParks();
    }

    /**
     * Create an instance of {@link GetParkViewResponse }
     * 
     */
    public GetParkViewResponse createGetParkViewResponse() {
        return new GetParkViewResponse();
    }

    /**
     * Create an instance of {@link InvalidUserFault }
     * 
     */
    public InvalidUserFault createInvalidUserFault() {
        return new InvalidUserFault();
    }

    /**
     * Create an instance of {@link ActivateUserResponse }
     * 
     */
    public ActivateUserResponse createActivateUserResponse() {
        return new ActivateUserResponse();
    }

    /**
     * Create an instance of {@link RentCar }
     * 
     */
    public RentCar createRentCar() {
        return new RentCar();
    }

    /**
     * Create an instance of {@link TestInitParkResponse }
     * 
     */
    public TestInitParkResponse createTestInitParkResponse() {
        return new TestInitParkResponse();
    }

    /**
     * Create an instance of {@link InitFault }
     * 
     */
    public InitFault createInitFault() {
        return new InitFault();
    }

    /**
     * Create an instance of {@link CoordinatesView }
     * 
     */
    public CoordinatesView createCoordinatesView() {
        return new CoordinatesView();
    }

    /**
     * Create an instance of {@link UserView }
     * 
     */
    public UserView createUserView() {
        return new UserView();
    }

    /**
     * Create an instance of {@link CarModelView }
     * 
     */
    public CarModelView createCarModelView() {
        return new CarModelView();
    }

    /**
     * Create an instance of {@link CarView }
     * 
     */
    public CarView createCarView() {
        return new CarView();
    }

    /**
     * Create an instance of {@link ParkView }
     * 
     */
    public ParkView createParkView() {
        return new ParkView();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "testPingResponse")
    public JAXBElement<TestPingResponse> createTestPingResponse(TestPingResponse value) {
        return new JAXBElement<TestPingResponse>(_TestPingResponse_QNAME, TestPingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAlreadyHasCarFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "UserAlreadyHasCarFault")
    public JAXBElement<UserAlreadyHasCarFault> createUserAlreadyHasCarFault(UserAlreadyHasCarFault value) {
        return new JAXBElement<UserAlreadyHasCarFault>(_UserAlreadyHasCarFault_QNAME, UserAlreadyHasCarFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestInit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "testInit")
    public JAXBElement<TestInit> createTestInit(TestInit value) {
        return new JAXBElement<TestInit>(_TestInit_QNAME, TestInit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoCarAvailableFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "NoCarAvailableFault")
    public JAXBElement<NoCarAvailableFault> createNoCarAvailableFault(NoCarAvailableFault value) {
        return new JAXBElement<NoCarAvailableFault>(_NoCarAvailableFault_QNAME, NoCarAvailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkViewResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "getParkViewResponse")
    public JAXBElement<GetParkViewResponse> createGetParkViewResponse(GetParkViewResponse value) {
        return new JAXBElement<GetParkViewResponse>(_GetParkViewResponse_QNAME, GetParkViewResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNearbyParks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "getNearbyParks")
    public JAXBElement<GetNearbyParks> createGetNearbyParks(GetNearbyParks value) {
        return new JAXBElement<GetNearbyParks>(_GetNearbyParks_QNAME, GetNearbyParks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestInitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "testInitResponse")
    public JAXBElement<TestInitResponse> createTestInitResponse(TestInitResponse value) {
        return new JAXBElement<TestInitResponse>(_TestInitResponse_QNAME, TestInitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitParkFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "InitParkFault")
    public JAXBElement<InitParkFault> createInitParkFault(InitParkFault value) {
        return new JAXBElement<InitParkFault>(_InitParkFault_QNAME, InitParkFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "activateUserResponse")
    public JAXBElement<ActivateUserResponse> createActivateUserResponse(ActivateUserResponse value) {
        return new JAXBElement<ActivateUserResponse>(_ActivateUserResponse_QNAME, ActivateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidUserFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "InvalidUserFault")
    public JAXBElement<InvalidUserFault> createInvalidUserFault(InvalidUserFault value) {
        return new JAXBElement<InvalidUserFault>(_InvalidUserFault_QNAME, InvalidUserFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "InitFault")
    public JAXBElement<InitFault> createInitFault(InitFault value) {
        return new JAXBElement<InitFault>(_InitFault_QNAME, InitFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestInitParkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "testInitParkResponse")
    public JAXBElement<TestInitParkResponse> createTestInitParkResponse(TestInitParkResponse value) {
        return new JAXBElement<TestInitParkResponse>(_TestInitParkResponse_QNAME, TestInitParkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RentCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "rentCar")
    public JAXBElement<RentCar> createRentCar(RentCar value) {
        return new JAXBElement<RentCar>(_RentCar_QNAME, RentCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RentCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "rentCarResponse")
    public JAXBElement<RentCarResponse> createRentCarResponse(RentCarResponse value) {
        return new JAXBElement<RentCarResponse>(_RentCarResponse_QNAME, RentCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "returnCar")
    public JAXBElement<ReturnCar> createReturnCar(ReturnCar value) {
        return new JAXBElement<ReturnCar>(_ReturnCar_QNAME, ReturnCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "returnCarResponse")
    public JAXBElement<ReturnCarResponse> createReturnCarResponse(ReturnCarResponse value) {
        return new JAXBElement<ReturnCarResponse>(_ReturnCarResponse_QNAME, ReturnCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "testPing")
    public JAXBElement<TestPing> createTestPing(TestPing value) {
        return new JAXBElement<TestPing>(_TestPing_QNAME, TestPing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNearbyParksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "getNearbyParksResponse")
    public JAXBElement<GetNearbyParksResponse> createGetNearbyParksResponse(GetNearbyParksResponse value) {
        return new JAXBElement<GetNearbyParksResponse>(_GetNearbyParksResponse_QNAME, GetNearbyParksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "getCreditResponse")
    public JAXBElement<GetCreditResponse> createGetCreditResponse(GetCreditResponse value) {
        return new JAXBElement<GetCreditResponse>(_GetCreditResponse_QNAME, GetCreditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestClear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "testClear")
    public JAXBElement<TestClear> createTestClear(TestClear value) {
        return new JAXBElement<TestClear>(_TestClear_QNAME, TestClear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParkView }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "getParkView")
    public JAXBElement<GetParkView> createGetParkView(GetParkView value) {
        return new JAXBElement<GetParkView>(_GetParkView_QNAME, GetParkView.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParkFullFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "ParkFullFault")
    public JAXBElement<ParkFullFault> createParkFullFault(ParkFullFault value) {
        return new JAXBElement<ParkFullFault>(_ParkFullFault_QNAME, ParkFullFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidParkFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "InvalidParkFault")
    public JAXBElement<InvalidParkFault> createInvalidParkFault(InvalidParkFault value) {
        return new JAXBElement<InvalidParkFault>(_InvalidParkFault_QNAME, InvalidParkFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestClearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "testClearResponse")
    public JAXBElement<TestClearResponse> createTestClearResponse(TestClearResponse value) {
        return new JAXBElement<TestClearResponse>(_TestClearResponse_QNAME, TestClearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarNotRentedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "CarNotRentedFault")
    public JAXBElement<CarNotRentedFault> createCarNotRentedFault(CarNotRentedFault value) {
        return new JAXBElement<CarNotRentedFault>(_CarNotRentedFault_QNAME, CarNotRentedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "activateUser")
    public JAXBElement<ActivateUser> createActivateUser(ActivateUser value) {
        return new JAXBElement<ActivateUser>(_ActivateUser_QNAME, ActivateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCredit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "getCredit")
    public JAXBElement<GetCredit> createGetCredit(GetCredit value) {
        return new JAXBElement<GetCredit>(_GetCredit_QNAME, GetCredit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsufficientCreditFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "InsufficientCreditFault")
    public JAXBElement<InsufficientCreditFault> createInsufficientCreditFault(InsufficientCreditFault value) {
        return new JAXBElement<InsufficientCreditFault>(_InsufficientCreditFault_QNAME, InsufficientCreditFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestInitPark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "testInitPark")
    public JAXBElement<TestInitPark> createTestInitPark(TestInitPark value) {
        return new JAXBElement<TestInitPark>(_TestInitPark_QNAME, TestInitPark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAlreadyExistsFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "EmailAlreadyExistsFault")
    public JAXBElement<EmailAlreadyExistsFault> createEmailAlreadyExistsFault(EmailAlreadyExistsFault value) {
        return new JAXBElement<EmailAlreadyExistsFault>(_EmailAlreadyExistsFault_QNAME, EmailAlreadyExistsFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidEmailFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ecar.com/", name = "InvalidEmailFault")
    public JAXBElement<InvalidEmailFault> createInvalidEmailFault(InvalidEmailFault value) {
        return new JAXBElement<InvalidEmailFault>(_InvalidEmailFault_QNAME, InvalidEmailFault.class, null, value);
    }

}
