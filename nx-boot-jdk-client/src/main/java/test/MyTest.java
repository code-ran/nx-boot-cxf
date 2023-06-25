package test;

import com.shzx.service.impl.HelloServiceImpl;
import com.shzx.service.impl.HelloServiceImplService;

/**
 * @description:
 * @author: rsb
 * @description: 2023-06-25-15-55
 * @description:
 * @Version: 1.0.0
 */
public class MyTest {
    public static void main(String[] args) {
        HelloServiceImplService helloServiceImplService = new HelloServiceImplService();
        HelloServiceImpl servicePort = helloServiceImplService.getHelloServiceImplPort();
        String var = servicePort.sayHello("张三");
        System.out.println("====调用成功===="+var);
    }
}
