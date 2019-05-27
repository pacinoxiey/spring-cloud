package com.xiey.practice.demo.redispubsub;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.CountDownLatch;


/**
 * @author xiey
 * @date 2019/5/23 16:12
 * @description：
 */
@Component
@Slf4j
public class RedisListener {



    @Autowired
    private StringRedisTemplate template;
    @Autowired
    private CountDownLatch latch;

    @PostConstruct
    public void test() throws InterruptedException {

    }
}
