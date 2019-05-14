package com.xiey.practice.gateway.controller;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author xiey
 * @date 2019/5/13 13:54
 * @description：
 */
@RestController
public class RouteLocatorController {


    @GetMapping("fallback")
    public Mono<String> fallback() {
        return Mono.just("fallback");
    }

    /**
     * 访问此项目的gateWay/value将转发到httpUri/gateWay/value并按需要添加参数
     *
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        String httpUri = "http://127.0.0.1:7001";
        return builder.routes()
                .route(predicateSpec -> predicateSpec
                        .path("/gateWay/value")
                        .filters(f -> f.addRequestParameter("key", "gateway"))
                        .uri(httpUri))
                //断路器暖用没有
                .route(predicateSpec -> predicateSpec
                        .host("*/gateWay/demo")
                        .filters(f -> f.hystrix(config -> config.setName("name")
                                .setFallbackUri("forward:fallback")))
                        .uri(httpUri))
                .route(predicateSpec -> predicateSpec
                        .path("/gateWay/post")
                        .uri(httpUri))
                .build();
    }
}
