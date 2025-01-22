package com.example.springboot_tool.service.dynamicfeign;

import com.example.springboot_tool.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 君颜未改
 * @create 2024-12-30-15:19
 */
@Service
public class DynamicClient {
    @Autowired
    private DynamicFeignClientFactory<DynamicService> dynamicFeignClientFactory;

    /**
     *
     * @param feignName 需要调用的微服务的名称
     * @param url        请求的url
     * @param queryMap   url上面的参数
     * @param params     body参数
     * @return
     */
    public Object executePostApi(String feignName, String url, Map<String, Object> queryMap, Object params) {
        DynamicService dynamicService = dynamicFeignClientFactory.getFeignClient(DynamicService.class, feignName);
        return dynamicService.executePostApi(url, queryMap, params);
    }

    public Object executeGetApi(String feignName, String url, Object params) {
        DynamicService dynamicService = dynamicFeignClientFactory.getFeignClient(DynamicService.class, feignName);
        return dynamicService.executeGetApi(url, params);
    }
}
