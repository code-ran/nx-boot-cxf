package com.shzx.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.shzx.annotation.AutoPublishWS;
import com.shzx.service.WSService;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@AutoPublishWS(publishPath = "autoDeptInfo")
@Service
@WebService
public class DeptInfoWSServiceImpl implements WSService {
    @WebMethod
    @WebResult(name = "resultName")
    @Override
    public String sayHello(@WebParam(name = "name") String name) {
        return String.format("hello,%s",name);
    }

    @WebMethod
    @WebResult(name = "deptInfo")
    @Override
    public String getInfo() {
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObject;
        for (int i = 0; i < 5; i++) {
            jsonObject = new JSONObject();
            jsonObject.put("deptCode","code"+(i+1));
            jsonObject.put("deptName","组织"+(i+1));
            jsonArray.add(jsonObject);
        }
        return jsonArray.toJSONString();
    }
}
