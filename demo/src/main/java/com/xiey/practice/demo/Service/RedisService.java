package com.xiey.practice.demo.Service;

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

    public void save(String key, String value){
    }
}
