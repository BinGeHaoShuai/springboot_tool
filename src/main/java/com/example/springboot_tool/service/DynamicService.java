package com.example.springboot_tool.service;

import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * 动态feign
 *
 * @author 君颜未改
 * @create 2024-12-30-15:10
 */
public interface DynamicService {
    /**
     * 动态 Post feign接口
     *
     * @param url    要调用微服务的接口url
     * @param queryMap 要调用微服务的接口url的参数
     * @param params 调用该接口所传递的body参数
     * @return
     */
    @PostMapping("{url}")
    Object executePostApi(@PathVariable("url") String url, @SpringQueryMap Map<String, Object> queryMap, @RequestBody Object params);

    /**
     * 动态Get feign接口
     *
     * @param url    要调用微服务的接口url
     * @param params 要调用微服务的接口url的参数
     * @return
     */
    @GetMapping("{url}")
    Object executeGetApi(@PathVariable("url") String url, @SpringQueryMap Object params);
}
