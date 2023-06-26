package com.shzx.controller;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: rsb
 * @description: 2023-06-26-14-39
 * @description:
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("/dynamic")
public class OmsSettingController {


    @RequestMapping("/getSettingInfo")
    public Object getSettingInfo() {
        DynamicClientFactory clientFactory = DynamicClientFactory.newInstance();
        Client client = clientFactory.createClient("http://127.0.0.1:8102/ws/autoSettingInfo?wsdl");
        Object[] objects;
        Object object = null;
        try {
            objects = client.invoke("getSettingInfo", new Object[]{"张三", "888888888"});
            if (objects != null) {
                object = objects[0];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
