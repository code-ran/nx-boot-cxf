package com.shzx.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2023-06-26T11:34:45.096+08:00
 * Generated source version: 3.5.0
 *
 */
@WebServiceClient(name = "HelloServiceImplService",
                  wsdlLocation = "http://10.123.10.213:8102/ws/hello?wsdl",
                  targetNamespace = "http://impl.service.shzx.com/")
public class HelloServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.shzx.com/", "HelloServiceImplService");
    public final static QName HelloServiceImplPort = new QName("http://impl.service.shzx.com/", "HelloServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://10.123.10.213:8102/ws/hello?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://10.123.10.213:8102/ws/hello?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public HelloServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns HelloServiceImpl
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloServiceImpl getHelloServiceImplPort() {
        return super.getPort(HelloServiceImplPort, HelloServiceImpl.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloServiceImpl
     */
    @WebEndpoint(name = "HelloServiceImplPort")
    public HelloServiceImpl getHelloServiceImplPort(WebServiceFeature... features) {
        return super.getPort(HelloServiceImplPort, HelloServiceImpl.class, features);
    }

}
