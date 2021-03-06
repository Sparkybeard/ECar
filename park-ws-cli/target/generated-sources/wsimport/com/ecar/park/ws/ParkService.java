
package com.ecar.park.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ParkService", targetNamespace = "http://ws.park.ecar.com/", wsdlLocation = "file:/home/miguel/Desktop/P1_test/park-ws-cli/../park-contract/ParkService.wsdl")
public class ParkService
    extends Service
{

    private final static URL PARKSERVICE_WSDL_LOCATION;
    private final static WebServiceException PARKSERVICE_EXCEPTION;
    private final static QName PARKSERVICE_QNAME = new QName("http://ws.park.ecar.com/", "ParkService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/miguel/Desktop/P1_test/park-ws-cli/../park-contract/ParkService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PARKSERVICE_WSDL_LOCATION = url;
        PARKSERVICE_EXCEPTION = e;
    }

    public ParkService() {
        super(__getWsdlLocation(), PARKSERVICE_QNAME);
    }

    public ParkService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PARKSERVICE_QNAME, features);
    }

    public ParkService(URL wsdlLocation) {
        super(wsdlLocation, PARKSERVICE_QNAME);
    }

    public ParkService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PARKSERVICE_QNAME, features);
    }

    public ParkService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ParkService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ParkPortType
     */
    @WebEndpoint(name = "ParkPort")
    public ParkPortType getParkPort() {
        return super.getPort(new QName("http://ws.park.ecar.com/", "ParkPort"), ParkPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ParkPortType
     */
    @WebEndpoint(name = "ParkPort")
    public ParkPortType getParkPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.park.ecar.com/", "ParkPort"), ParkPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PARKSERVICE_EXCEPTION!= null) {
            throw PARKSERVICE_EXCEPTION;
        }
        return PARKSERVICE_WSDL_LOCATION;
    }

}
