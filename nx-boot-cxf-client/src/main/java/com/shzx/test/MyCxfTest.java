package com.shzx.test;

import com.shzx.service.impl.HelloServiceImpl;
import com.shzx.service.impl.HelloServiceImplService;

/**
 * @description:
 * @author: rsb
 * @description: 2023-06-26-11-36
 * @description:
 * @Version: 1.0.0
 */
public class MyCxfTest {
    public static void main(String[] args) {
        HelloServiceImplService helloServiceImplService = new HelloServiceImplService();
        HelloServiceImpl serverport = helloServiceImplService.getHelloServiceImplPort();
        String msg = serverport.sayHello("泽鑫");
        System.out.println("远程调用ws服务成功:"+msg);

    }
}
