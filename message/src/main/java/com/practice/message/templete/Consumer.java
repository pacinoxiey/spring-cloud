package com.practice.message.templete;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author xiey
 * @version 2019年5月22日 15点24分
 * @describe
 */
@Component
public class Consumer {
	// 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
	@JmsListener(destination = "mytest.queue")
	// @SendTo("out.queue") 会将return的返回值发送到out.queue
	public void receiveQueue(String text) {
		System.out.println("Consumer收到的报文为:" + text);
//		return text;
	}
}