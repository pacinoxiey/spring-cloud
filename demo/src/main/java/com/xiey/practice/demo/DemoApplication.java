package com.xiey.practice.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication(scanBasePackages = "com.xiey.practice.demo")
public class DemoApplication {

//    /**
//     * 向redis添加监听频道
//     *
//     * @param connectionFactory
//     * @param listenerAdapter
//     * @return
//     */
//    @Bean
//    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
//                                            MessageListenerAdapter listenerAdapter) {
//
//        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory);
//        container.addMessageListener(listenerAdapter, new PatternTopic("chat"));
////        container.addMessageListener(listenerAdapter, new PatternTopic("gg"));
//
//        return container;
//    }

    /**
     * @param receiver 由于是pojo类, 包装在MessageListenerAdapter并且指定接收到消息的执行方法 *receiveMessage*
     * @return
     */
//    @Bean
//    MessageListenerAdapter listenerAdapter(Receiver receiver) {
//        return new MessageListenerAdapter(receiver, "receiveMessage");
//    }

//    @Bean
//    Receiver receiver(CountDownLatch latch) {
//        return new Receiver(latch);
//    }

//    @Bean
//    CountDownLatch latch() {
//        return new CountDownLatch(1);
//    }

//    @Bean
//    StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
//        return new StringRedisTemplate(connectionFactory);
//    }

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

//        StringRedisTemplate template = ctx.getBean(StringRedisTemplate.class);
//        CountDownLatch latch = ctx.getBean(CountDownLatch.class);
//
//        log.info("Sending message...");
//        template.convertAndSend("chat", "Hello from Redis!");
//        template.convertAndSend("gg", "gg from Redis!");
//        latch.await();

//        System.exit(0);
    }

}
