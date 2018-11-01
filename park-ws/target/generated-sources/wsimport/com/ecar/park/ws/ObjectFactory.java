
package com.ecar.park.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ecar.park.ws package. 
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

    private final static QName _TestInitResponse_QNAME = new QName("http://ws.park.ecar.com/", "testInitResponse");
    private final static QName _NoCarFault_QNAME = new QName("http://ws.park.ecar.com/", "NoCarFault");
    private final static QName _RentCarResponse_QNAME = new QName("http://ws.park.ecar.com/", "rentCarResponse");
    private final static QName _ReturnCar_QNAME = new QName("http://ws.park.ecar.com/", "returnCar");
    private final static QName _ReturnCarResponse_QNAME = new QName("http://ws.park.ecar.com/", "returnCarResponse");
    private final static QName _TestPing_QNAME = new QName("http://ws.park.ecar.com/", "testPing");
    private final static QName _TestPingResponse_QNAME = new QName("http://ws.park.ecar.com/", "testPingResponse");
    private final static QName _GetInfo_QNAME = new QName("http://ws.park.ecar.com/", "getInfo");
    private final static QName _TestInit_QNAME = new QName("http://ws.park.ecar.com/", "testInit");
    private final static QName _GetStats_QNAME = new QName("http://ws.park.ecar.com/", "getStats");
    private final static QName _TestClear_QNAME = new QName("http://ws.park.ecar.com/", "testClear");
    private final static QName _BadInitFault_QNAME = new QName("http://ws.park.ecar.com/", "BadInitFault");
    private final static QName _NoSpaceFault_QNAME = new QName("http://ws.park.ecar.com/", "NoSpaceFault");
    private final static QName _RentCar_QNAME = new QName("http://ws.park.ecar.com/", "rentCar");
    private final static QName _TestClearResponse_QNAME = new QName("http://ws.park.ecar.com/", "testClearResponse");
    private final static QName _GetStatsResponse_QNAME = new QName("http://ws.park.ecar.com/", "getStatsResponse");
    private final static QName _GetInfoResponse_QNAME = new QName("http://ws.park.ecar.com/", "getInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ecar.park.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStats }
     * 
     */
    public GetStats createGetStats() {
        return new GetStats();
    }

    /**
     * Create an instance of {@link TestClear }
     * 
     */
    public TestClear createTestClear() {
        return new TestClear();
    }

    /**
     * Create an instance of {@link TestInit }
     * 
     */
    public TestInit createTestInit() {
        return new TestInit();
    }

    /**
     * Create an instance of {@link GetInfo }
     * 
     */
    public GetInfo createGetInfo() {
        return new GetInfo();
    }

    /**
     * Create an instance of {@link TestPingResponse }
     * 
     */
    public TestPingResponse createTestPingResponse() {
        return new TestPingResponse();
    }

    /**
     * Create an instance of {@link NoCarFault }
     * 
     */
    public NoCarFault createNoCarFault() {
        return new NoCarFault();
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
     * Create an instance of {@link TestInitResponse }
     * 
     */
    public TestInitResponse createTestInitResponse() {
        return new TestInitResponse();
    }

    /**
     * Create an instance of {@link GetInfoResponse }
     * 
     */
    public GetInfoResponse createGetInfoResponse() {
        return new GetInfoResponse();
    }

    /**
     * Create an instance of {@link GetStatsResponse }
     * 
     */
    public GetStatsResponse createGetStatsResponse() {
        return new GetStatsResponse();
    }

    /**
     * Create an instance of {@link TestClearResponse }
     * 
     */
    public TestClearResponse createTestClearResponse() {
        return new TestClearResponse();
    }

    /**
     * Create an instance of {@link RentCar }
     * 
     */
    public RentCar createRentCar() {
        return new RentCar();
    }

    /**
     * Create an instance of {@link NoSpaceFault }
     * 
     */
    public NoSpaceFault createNoSpaceFault() {
        return new NoSpaceFault();
    }

    /**
     * Create an instance of {@link BadInitFault }
     * 
     */
    public BadInitFault createBadInitFault() {
        return new BadInitFault();
    }

    /**
     * Create an instance of {@link Xy }
     * 
     */
    public Xy createXy() {
        return new Xy();
    }

    /**
     * Create an instance of {@link ParkStats }
     * 
     */
    public ParkStats createParkStats() {
        return new ParkStats();
    }

    /**
     * Create an instance of {@link ParkInfo }
     * 
     */
    public ParkInfo createParkInfo() {
        return new ParkInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestInitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "testInitResponse")
    public JAXBElement<TestInitResponse> createTestInitResponse(TestInitResponse value) {
        return new JAXBElement<TestInitResponse>(_TestInitResponse_QNAME, TestInitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoCarFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "NoCarFault")
    public JAXBElement<NoCarFault> createNoCarFault(NoCarFault value) {
        return new JAXBElement<NoCarFault>(_NoCarFault_QNAME, NoCarFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RentCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "rentCarResponse")
    public JAXBElement<RentCarResponse> createRentCarResponse(RentCarResponse value) {
        return new JAXBElement<RentCarResponse>(_RentCarResponse_QNAME, RentCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "returnCar")
    public JAXBElement<ReturnCar> createReturnCar(ReturnCar value) {
        return new JAXBElement<ReturnCar>(_ReturnCar_QNAME, ReturnCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "returnCarResponse")
    public JAXBElement<ReturnCarResponse> createReturnCarResponse(ReturnCarResponse value) {
        return new JAXBElement<ReturnCarResponse>(_ReturnCarResponse_QNAME, ReturnCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPing }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "testPing")
    public JAXBElement<TestPing> createTestPing(TestPing value) {
        return new JAXBElement<TestPing>(_TestPing_QNAME, TestPing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestPingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "testPingResponse")
    public JAXBElement<TestPingResponse> createTestPingResponse(TestPingResponse value) {
        return new JAXBElement<TestPingResponse>(_TestPingResponse_QNAME, TestPingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "getInfo")
    public JAXBElement<GetInfo> createGetInfo(GetInfo value) {
        return new JAXBElement<GetInfo>(_GetInfo_QNAME, GetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestInit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "testInit")
    public JAXBElement<TestInit> createTestInit(TestInit value) {
        return new JAXBElement<TestInit>(_TestInit_QNAME, TestInit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "getStats")
    public JAXBElement<GetStats> createGetStats(GetStats value) {
        return new JAXBElement<GetStats>(_GetStats_QNAME, GetStats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestClear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "testClear")
    public JAXBElement<TestClear> createTestClear(TestClear value) {
        return new JAXBElement<TestClear>(_TestClear_QNAME, TestClear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BadInitFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "BadInitFault")
    public JAXBElement<BadInitFault> createBadInitFault(BadInitFault value) {
        return new JAXBElement<BadInitFault>(_BadInitFault_QNAME, BadInitFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoSpaceFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "NoSpaceFault")
    public JAXBElement<NoSpaceFault> createNoSpaceFault(NoSpaceFault value) {
        return new JAXBElement<NoSpaceFault>(_NoSpaceFault_QNAME, NoSpaceFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RentCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "rentCar")
    public JAXBElement<RentCar> createRentCar(RentCar value) {
        return new JAXBElement<RentCar>(_RentCar_QNAME, RentCar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestClearResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "testClearResponse")
    public JAXBElement<TestClearResponse> createTestClearResponse(TestClearResponse value) {
        return new JAXBElement<TestClearResponse>(_TestClearResponse_QNAME, TestClearResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "getStatsResponse")
    public JAXBElement<GetStatsResponse> createGetStatsResponse(GetStatsResponse value) {
        return new JAXBElement<GetStatsResponse>(_GetStatsResponse_QNAME, GetStatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.park.ecar.com/", name = "getInfoResponse")
    public JAXBElement<GetInfoResponse> createGetInfoResponse(GetInfoResponse value) {
        return new JAXBElement<GetInfoResponse>(_GetInfoResponse_QNAME, GetInfoResponse.class, null, value);
    }

}
