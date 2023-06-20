####                                                      SpringBoot整合WebService

##### 一、使用JDK自带的JAX-WS发布WebService服务

1、通过maven创建普通的java项目

![image-20230620170436731](SpringBoot整合WebService.assets/image-20230620170436731.png)

2、编写接口和实现类:

![image-20230620170548670](SpringBoot整合WebService.assets/image-20230620170548670.png)

HelloService.java接口

```java
package com.shzx.service;

/**
 * @description:
 * @author: rsb
 * @description: 2023-06-20-16-36
 * @description:
 * @Version: 1.0.0
 */
public interface HelloService {
    String sayHello(String name);
}
```

HelloService的实现HelloServiceImpl.java

```java
package com.shzx.service.impl;

import com.shzx.service.HelloService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @description:
 * @author: rsb
 * @description: 2023-06-20-16-36
 * @description: 使用JDK自带的 JAX-WS 发布WebService服务
 * @Version: 1.0.0
 */
@WebService
public class HelloServiceImpl implements HelloService {
    @WebMethod
    @WebResult(name = "resultName")
    @Override
    public String sayHello(@WebParam(name = "name") String name) {
        return "Hello ," + name;
    }
}
```

编写启动类WsPublish.java

```java
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
```

启动项目

![image-20230620170902569](SpringBoot整合WebService.assets/image-20230620170902569.png)

访问发布的地址，记得加上wsdl

![image-20230620171010440](SpringBoot整合WebService.assets/image-20230620171010440.png)

然后再访问schemaLocation指向的地址:http://localhost:8888/ws?xsd=1

![image-20230620171054409](SpringBoot整合WebService.assets/image-20230620171054409.png)