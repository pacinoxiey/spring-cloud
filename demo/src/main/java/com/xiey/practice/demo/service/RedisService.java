package com.xiey.practice.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author xiey
 * @date 2019/5/23 11:16
 * @description：
 */
@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    public void strSet(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public String strGet(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }
}
