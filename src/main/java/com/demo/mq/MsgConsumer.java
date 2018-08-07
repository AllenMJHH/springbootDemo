package com.demo.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author mjh
 * @date 2018/8/7 21:51
 */
@Component
public class MsgConsumer {

    @JmsListener(destination = "myTest.queue")
    public void receiveQueue(String text) {
        System.out.println("consumer收的的报文是：" + text);
    }
}
