package com.shzx.controller;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dynamic")
public class DynamicClientController {

    /**
     * 不需要通过wsdl文档生成代码，直接通过cxf的动态调用，调用服务即可。
     * 官网:https://cxf.apache.org/docs/dynamic-clients.html
     * @return
     */
    @RequestMapping("/getHelloInfo")
    public String getHelloInfo() {
        JaxWsDynamicClientFactory jaxWsDynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = jaxWsDynamicClientFactory.createClient("http://10.123.10.213:8102/ws/autoUserInfo?wsdl");
        Object[] objects;
        String result = null;
        try {
            objects = client.invoke("sayHello", new Object[]{"张三"});
            if (objects != null) {
                result = (String) objects[0];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * description: 获取用户信息
     *
     * @param
     * @return String
     */
    @RequestMapping("/getUserInfo")
    public String getUserInfo() {
        DynamicClientFactory clientFactory = DynamicClientFactory.newInstance();
        Client client = clientFactory.createClient("http://10.123.10.213:8102/ws/autoUserInfo?wsdl");
        Object[] objects;
        String result = null;
        try {
            objects = client.invoke("getInfo", new Object[]{});
            if (objects != null) {
                result = (String) objects[0];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * description: 获取组织信息
     *
     * @param
     * @return String
     */
    @RequestMapping("/getDeptInfo")
    public String getDeptInfo() {
        DynamicClientFactory clientFactory = DynamicClientFactory.newInstance();
        Client client = clientFactory.createClient("http://10.123.10.213:8102/ws/autoDeptInfo?wsdl");
        Object[] objects;
        String result = null;
        try {
            objects = client.invoke("getInfo", new Object[]{});
            if (objects != null) {
                result = (String) objects[0];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * description: 动态调用.net发布的WebService接口，并获取信息
     *
     * @param
     * @return String
     */
    @RequestMapping("/getNetInfo")
    public String getNetInfo() {
        DynamicClientFactory clientFactory = DynamicClientFactory.newInstance();
        Client client = clientFactory.createClient("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl");
        Object[] objects;
        String result = null;
        try {
            objects = client.invoke("getSupportProvince", new Object[]{});
            if (objects != null) {
                result = (String) objects[0];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
