package com.example.springboot_tool.service.dynamicfeign;

import org.springframework.cloud.openfeign.FeignClientBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author 君颜未改
 * @create 2024-12-30-15:21
 */
@Component
public class DynamicFeignClientFactory<T> {
    private FeignClientBuilder feignClientBuilder;

    public DynamicFeignClientFactory(ApplicationContext appContext) {
        this.feignClientBuilder = new FeignClientBuilder(appContext);
    }

    public T getFeignClient(final Class<T> type, String serviceId) {
        return this.feignClientBuilder.forType(type, serviceId).build();
    }
}
