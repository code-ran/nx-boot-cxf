package com.shzx.config;

import com.shzx.service.impl.DeptInfoWSServiceImpl;
import com.shzx.service.impl.HelloServiceImpl;
import com.shzx.service.impl.UserInfoWSServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * description: CXF服务常规发布配置--代码会冗余
 */
@Configuration
@Slf4j
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private HelloServiceImpl helloService;

    @Autowired
    private UserInfoWSServiceImpl userInfoWSService;

    @Autowired
    private DeptInfoWSServiceImpl deptInfoWSService;

    @Value("${application.cxfenable:N}")
    private String cxfEnable;


    /**
     * description: hello webService服务
     *
     * @param
     * @return String
     */
    @Bean
    public Endpoint helloServer() {
        if ("N".equals(cxfEnable)) {
            log.info("CXF服务常规发布获取到的配置为N");
            return null;
        }
        EndpointImpl endpoint = new EndpointImpl(bus, helloService);
        //访问:http://localhost:8102/ws/hello?wsdl
        endpoint.publish("/hello");
        return endpoint;

    }


    /**
     * description: 用户信息 WebService服务
     *
     * @param
     * @return String
     */
    @Bean
    public Endpoint userInfo() {
        if ("N".equals(cxfEnable)) {
            return null;
        }
        EndpointImpl endpoint = new EndpointImpl(bus, userInfoWSService);
        endpoint.publish("/userInfo");
        return endpoint;
    }

    /**
     * description: 组织信息webservice服务
     *
     * @param
     * @return String
     */
    @Bean
    public Endpoint orgInfo() {
        if ("N".equals(cxfEnable)) {
            return null;
        }
        EndpointImpl endpoint = new EndpointImpl(bus, deptInfoWSService);
        endpoint.publish("/orgInfo");
        return endpoint;
    }
}
