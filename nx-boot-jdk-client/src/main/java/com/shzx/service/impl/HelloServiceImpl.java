
package com.shzx.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloServiceImpl", targetNamespace = "http://impl.service.shzx.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloServiceImpl {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "resultName", targetNamespace = "")
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://impl.service.shzx.com/", className = "com.shzx.service.impl.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://impl.service.shzx.com/", className = "com.shzx.service.impl.SayHelloResponse")
    public String sayHello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

}
