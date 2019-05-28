package com.xiey.practice.demo.config;

import com.xiey.practice.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;

/**
 * @author xiey
 * @date 2019/5/23 11:10
 * @description：
 */
@Configuration
public class RedisConfig {

//    @Autowired
//    private MessageListener messageListener;

    @Autowired
    private RedisService redisService;
    @Autowired
    private RedisTemplate redisTemplate;

    @Bean
    RedisMessageListenerContainer container(MessageListenerAdapter listenerAdapter) {

        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
        container.setConnectionFactory(redisTemplate.getConnectionFactory());
        //所有失效key都会发送到__keyevent@0__:expired频道
        container.addMessageListener(listenerAdapter, new PatternTopic("__keyevent@0__:expired"));
        container.addMessageListener(listenerAdapter, new PatternTopic("channel_test"));
        return container;
    }

    @Bean
    MessageListenerAdapter listenerAdapter() {
        return new MessageListenerAdapter(redisService);
    }

}
