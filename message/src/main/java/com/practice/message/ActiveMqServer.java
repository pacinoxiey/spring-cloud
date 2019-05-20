package com.practice.message;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.jms.*;

/**
 * @author xiey
 * @date 2019/5/20 15:19
 * @description：
 */
public class ActiveMqServer {

    @Value("${spring.activemq.broker-url}")
    private String brokerUrl;

    public void producer() throws JMSException {
        //创建工厂连接对象
        ConnectionFactory factory = new ActiveMQConnectionFactory(brokerUrl);
        //获取连接
        Connection connection = factory.createConnection();
        connection.start();
        //创建会话对象
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Topic topic = session.createTopic("test-topic");
        //创建生产者
        MessageProducer producer = session.createProducer(topic);
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
        TextMessage xxx = session.createTextMessage("xxx");
        producer.send(xxx);//发送消息

        producer.close();
        session.close();
        connection.close();
//        DefaultJmsActivationSpecFactory defaultJmsActivationSpecFactory = new DefaultJmsActivationSpecFactory();

    }
}
