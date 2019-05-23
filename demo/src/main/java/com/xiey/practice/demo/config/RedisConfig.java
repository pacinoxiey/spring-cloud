package com.xiey.practice.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

/**
 * @author xiey
 * @date 2019/5/23 11:10
 * @description：
 */
public class RedisConfig {

    /**
     * 使用StringRedisTemplate则不用配置序列化方法, 已经封装了
     */
//    @Bean
//    public RedisTemplate setRedisTemplate() {
//        RedisTemplate redisTemplate = new RedisTemplate();
//        RedisSerializer stringSerializer = new StringRedisSerializer();
//        redisTemplate.setKeySerializer(stringSerializer);
//        redisTemplate.setValueSerializer(stringSerializer);
//        redisTemplate.setHashKeySerializer(stringSerializer);
//        redisTemplate.setHashValueSerializer(stringSerializer);
//        return redisTemplate;
//    }

}
