package com.example.springboot_tool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 君颜未改
 * @create 2024-12-30-20:12
 */
@Configuration
public class RestTemplateConfig {
    // 不使用负载均衡器
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
