package com.example.springboot_tool.service.dynamicfeign;

import com.example.springboot_tool.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 君颜未改
 * @create 2024-12-30-15:19
 */
@Service
public class DynamicClient {
    @Autowired
    private DynamicFeignClientFactory<DynamicService> dynamicFeignClientFactory;

    public Object executePostApi(String feignName, String url, Object params) {
        DynamicService dynamicService = dynamicFeignClientFactory.getFeignClient(DynamicService.class, feignName);
        return dynamicService.executePostApi(url, params);
    }

    public Object executeGetApi(String feignName, String url, Object params) {
        DynamicService dynamicService = dynamicFeignClientFactory.getFeignClient(DynamicService.class, feignName);
        return dynamicService.executeGetApi(url, params);
    }
}
