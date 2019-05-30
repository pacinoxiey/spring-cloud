package com.xiey.practice.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author xiey
 * @date 2019/5/23 11:16
 * @description：
 */
@Slf4j
@Service
public class RedisService implements MessageListener {

    @Autowired
    private RedisTemplate redisTemplate;

    public void strSet(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public String strGet(String key) {
        return (String) redisTemplate.opsForValue().get(key);
    }

    /**
     * 被监听的频道消息会被接收
     */
    @Override
    public void onMessage(Message message, byte[] bytes) {
        String channel = new String(message.getChannel());
        String body = new String(message.getBody());
        log.info("监听到消息: channel:{} body:{} byte:{}", channel, body, new String(bytes));
        //业务处理
    }
}
