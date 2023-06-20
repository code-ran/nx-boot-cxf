package com.shzx;

import com.shzx.service.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * @description:
 * @author: rsb
 * @description: 2023-06-20-16-40
 * @description: 使用JDK自带的 JAX-WS 发布WebService服务
 * @Version: 1.0.0
 */
public class WsPublish {
    public static void main(String[] args) {
        String address = "http://localhost:8888/ws";
        Endpoint.publish(address,new HelloServiceImpl());
        System.out.println("服务已发布");
    }
}
