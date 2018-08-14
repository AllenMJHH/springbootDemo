package com.demo.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

/**
 * @author mjh
 * @date 2018/8/7 21:47
 */
@Service("MsgProducer")
public class MsgProducer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 发送消息
     * @param message
     * @param destination
     */
    public void sendMessage( Destination destination,final String message) {
        jmsMessagingTemplate.convertAndSend(destination,message);
    }
}
