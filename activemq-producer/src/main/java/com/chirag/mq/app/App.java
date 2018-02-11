package com.chirag.mq.app;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.chirag.mq.producer.Producer;

public class App {

	public static String brokerURL = "tcp://localhost:61616";

	public static void main(String[] args) throws JMSException {
		ConnectionFactory factory = new ActiveMQConnectionFactory(brokerURL);
		
		Producer producer = new Producer(factory, "ChiragMQTest");
		producer.run();
		producer.close();
	}
}
