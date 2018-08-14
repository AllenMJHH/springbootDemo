package com.example;

import com.demo.DemoApplication;
import com.demo.controller.TeacherController;
import com.demo.rabbitmq.Sender;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author mjh
 * @date 2018/7/21 21:56
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class DemoApplicationTests {

    private MockMvc mockMvc;
    @Autowired
    private TeacherController teacherController;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private Sender sender;




    @Test
    public void demo() {
        Assert.assertSame("aaa", 10, teacherController.test("123"));
    }
    @Test
    public void rabbitmqTest() {
        sender.sendMsg();
    }
}
