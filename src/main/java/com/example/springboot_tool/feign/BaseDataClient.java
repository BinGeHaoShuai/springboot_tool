package com.example.springboot_tool.feign;

import com.example.springboot_tool.demos.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 君颜未改
 * @create 2024-12-30-15:02
 */
@FeignClient(name = "basedata-service", url = "http://localhost:8081")
public interface BaseDataClient {
    @RequestMapping("/user")
    User user();
}
