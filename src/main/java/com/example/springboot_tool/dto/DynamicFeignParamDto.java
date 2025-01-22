package com.example.springboot_tool.dto;

import lombok.Data;

import java.util.Map;

/** 动态feign入参
 * @author 君颜未改
 * @create 2025-01-22-23:59
 */
@Data
public class DynamicFeignParamDto {
    private String feignName;

    private String requestUrl;

    private Map<String, Object> params;
}
