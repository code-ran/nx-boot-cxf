package test;

import com.test.UserInfoWSServiceImpl;
import com.test.UserInfoWSServiceImplService;

/**
 * @description:
 * @author: rsb
 * @description: 2023-06-25-16-10
 * @description:
 * @Version: 1.0.0
 */
public class MyTestUserInfo {
    public static void main(String[] args) {
        UserInfoWSServiceImplService userInfoService = new UserInfoWSServiceImplService();
        UserInfoWSServiceImpl servicePort = userInfoService.getUserInfoWSServiceImplPort();
        String msg = servicePort.getInfo();
        System.out.println("====调用成功===="+msg);

    }
}
