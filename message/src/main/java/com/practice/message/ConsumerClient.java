package com.practice.message;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author xiey
 * @date 2019/5/20 16:18
 * @description：
 */
public class ConsumerClient {


    public static void main(String[] args) throws JMSException {

        ConnectionFactory factory = new ActiveMQConnectionFactory(
                "admin", "admin", "tcp://127.0.0.1:61616");
        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Topic topic = session.createTopic("test-topic");
        MessageConsumer consumer = session.createConsumer(topic);


        consumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                System.err.println("receive message:" + message);
            }
        });
    }


}
