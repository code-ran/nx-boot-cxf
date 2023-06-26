package com.shzx.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.shzx.annotation.AutoPublishWS;
import com.shzx.service.MutiParamSerevice;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @description:
 * @author: rsb
 * @description: 2023-06-26-14-54
 * @description:
 * @Version: 1.0.0
 */
@AutoPublishWS(publishPath = "autoSettingInfo")
@Service
@WebService
public class MutiParamServiceImpl implements MutiParamSerevice {

    @WebMethod
    @WebResult(name = "settingInfo")
    @Override
    public JSONObject getSettingInfo(String name, String age) {
        JSONObject jsonObject = new JSONObject();
        if (name != null && age != null) {
            jsonObject.put("姓名", name);
            jsonObject.put("年龄", age);
        }
        return jsonObject;
    }
}
