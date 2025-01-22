package com.example.springboot_tool.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.springboot_tool.demos.User;
import com.example.springboot_tool.dto.DynamicFeignParamDto;
import com.example.springboot_tool.feign.BaseDataClient;
import com.example.springboot_tool.service.dynamicfeign.DynamicClient;
import com.example.springboot_tool.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    public Result<Object> sendPostFeign(@RequestParam Map<String, Object> queryMap, @RequestBody DynamicFeignParamDto feignParamDto) {
        Object result = dynamicClient.executePostApi(feignParamDto.getFeignName(), feignParamDto.getRequestUrl(), queryMap, feignParamDto.getParams());
        System.out.println("print post result ==========> " + JSONObject.toJSONString(result));
        return new Result<>(result);
    }

    @GetMapping("/getFeign")
    public Result<Object> sendGetFeign(@RequestParam Map<String, Object> queryMap, @RequestBody DynamicFeignParamDto feignParamDto) {
        Object result = dynamicClient.executeGetApi(feignParamDto.getFeignName(), feignParamDto.getRequestUrl(), queryMap);
        System.out.println("print get result ==========> " + JSONObject.toJSONString(result));
        return new Result<>(result);
    }
}
