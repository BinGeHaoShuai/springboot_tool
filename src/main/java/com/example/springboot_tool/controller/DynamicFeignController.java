package com.example.springboot_tool.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.springboot_tool.demos.User;
import com.example.springboot_tool.feign.BaseDataClient;
import com.example.springboot_tool.service.dynamicfeign.DynamicClient;
import com.example.springboot_tool.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 动态feign测试接口
 *
 * @author 君颜未改
 * @create 2024-12-30-15:37
 */
@RestController
@RequestMapping("dynamicFeign")
public class DynamicFeignController {
    @Autowired
    private DynamicClient dynamicClient;

    @Autowired
    private BaseDataClient baseDataClient;

    @PostMapping("/postFeign")
    public Result sendPostFeign() {
        Object result = dynamicClient.executePostApi("springboot-tool-service2", "/user", new HashMap<>());
        System.out.println("print result ==========> " + JSONObject.toJSONString(result));
        return new Result();
    }
}
