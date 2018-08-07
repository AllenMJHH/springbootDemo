package com.demo.controller;

import com.demo.dao.teacher.TeacherMapper;
import com.demo.service.ITeacherService;
import com.demo.vo.TeacherVO;
import com.demo.vo.entity.Teacher;
import org.jasypt.encryption.StringEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mjh
 * @date 2018/7/7 1:47
 */
@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private StringEncryptor stringEncryptor;

    //日志
    private final Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/getTeacher",method = RequestMethod.GET)
    public TeacherVO getTeacher(TeacherVO teacherVO) {
        return  teacherService.getTeacher(teacherVO);
    }
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public Teacher test(String id) {
        id="123";

        return teacherService.selectByPrimaryKey(id);
    }
    @RequestMapping(value = "/data")
    public void dataTest() {
        System.out.println(stringEncryptor.encrypt("java"));
    }

}
