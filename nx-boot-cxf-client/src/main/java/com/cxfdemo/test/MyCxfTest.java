package com.cxfdemo.test;

import com.cxfdemo.DeptInfoWSServiceImpl;
import com.cxfdemo.DeptInfoWSServiceImplService;

/**
 * @description:
 * @author: rsb
 * @description: 2023-06-26-11-46
 * @description:
 * @Version: 1.0.0
 */
public class MyCxfTest {
    public static void main(String[] args) {
        DeptInfoWSServiceImplService wsService = new DeptInfoWSServiceImplService();
        DeptInfoWSServiceImpl serverPort = wsService.getDeptInfoWSServiceImplPort();
        String msg = serverPort.getInfo();
        System.out.println("远程调用ws服务成功:" + msg);
    }
}
