package com.demo.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author mjh
 * @date 2018/8/14 21:43
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMsg() {
        String context = "rabbitmq message test,发送时间：" + new Date();
        amqpTemplate.convertAndSend("rabbitTestMsg",context);

    }
}
