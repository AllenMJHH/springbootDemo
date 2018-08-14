package com.demo.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author mjh
 * @date 2018/8/14 21:46
 */
@Component
@RabbitListener(queues = "rabbitTestMsg")
public class Receiver {

    @RabbitHandler
    public void process(String message) {
        System.out.println("receiver 接收到消息:"+message+"，时间:"+new Date());
    }
}
