package com.example;

import com.demo.DemoApplication;
import com.demo.controller.TeacherController;
import com.demo.vo.entity.Teacher;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.net.SocketFlow;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

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




    @Test
    public void demo() {
        Assert.assertSame("aaa", 10, teacherController.test("123"));
    }
}
