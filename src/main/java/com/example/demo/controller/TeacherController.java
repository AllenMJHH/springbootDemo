package com.example.demo.controller;

import com.example.demo.service.ITeacherService;
import com.example.demo.vo.TeacherVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mjh
 * @date 2018/7/7 1:47
 */
@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    //日志
    private final Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @RequestMapping(value = "/findTeacher",method = RequestMethod.GET)
    public List<TeacherVO> findTeacher(TeacherVO teacherVO) {
        logger.info("TeacherController findTeacher,param:" + teacherVO);
        return teacherService.findTeacher(teacherVO);
    }
}
