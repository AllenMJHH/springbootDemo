package com.example.demo.service.impl;

import com.example.demo.service.ITeacherService;
import com.example.demo.vo.TeacherVO;
import com.example.demo.vo.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mjh
 * @date 2018/7/7 1:45
 */
@Service
public class TeacherServiceImpl implements ITeacherService {
    @Override
    public int addTeacher(List<Teacher> teacherList) {
        return 0;
    }

    @Override
    public int updateTeacher(List<Teacher> teacherList) {
        return 0;
    }

    @Override
    public List<TeacherVO> findTeacher(TeacherVO teacherVO) {
        List<TeacherVO> teacherVOList = new ArrayList<>();
        TeacherVO vo = new TeacherVO();
        vo.setId("1");
        vo.setName("tome");
        vo.setSex("F");
        teacherVOList.add(vo);
        return teacherVOList;
    }
}
