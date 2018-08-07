package com.example;

import com.demo.DemoApplication;
import com.demo.mq.MsgProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author mjh
 * @date 2018/8/7 21:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class SpringbootJmsTests {
    @Autowired
    private MsgProducer msgProducer;
    @Test
    public void contextLoads() {
        ActiveMQQueue myTest_queue = new ActiveMQQueue("myTest.queue");
        for (int i = 0; i < 100; i++) {
            msgProducer.sendMessage(myTest_queue,"测试消息"+i);
        }
    }
}
