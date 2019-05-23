package com.xiey.practice.demo.api;

import com.xiey.practice.demo.service.RedisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xiey
 * @date 2019/5/23 16:26
 * @description：
 */
@RestController
@RequestMapping("redis")
public class RedisApi {

    @Resource
    private RedisService redisService;

    @GetMapping("strSet")
    public void strSet(@RequestParam("key") String key, @RequestParam("value") String value) {
        redisService.strSet(key, value);
    }

    @GetMapping("strGet")
    public void strGet(@RequestParam("key") String key) {
        redisService.strGet(key);
    }
}
