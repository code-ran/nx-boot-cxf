package com.shzx.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.5.0
 * 2023-06-26T11:34:45.066+08:00
 * Generated source version: 3.5.0
 *
 */
@WebService(targetNamespace = "http://impl.service.shzx.com/", name = "HelloServiceImpl")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloServiceImpl {

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://impl.service.shzx.com/", className = "com.shzx.service.impl.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://impl.service.shzx.com/", className = "com.shzx.service.impl.SayHelloResponse")
    @WebResult(name = "resultName", targetNamespace = "")
    public java.lang.String sayHello(

        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name
    );
}
