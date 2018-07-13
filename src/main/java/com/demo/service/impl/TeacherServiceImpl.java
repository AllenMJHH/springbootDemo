package com.demo.service.impl;

import com.demo.dao.teacher.TeacherMapper;
import com.demo.service.ITeacherService;
import com.demo.vo.TeacherVO;
import com.demo.vo.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mjh
 * @date 2018/7/13 22:18
 */
@Service
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Teacher record) {
        return 0;
    }

    @Override
    public int insertSelective(Teacher record) {
        return 0;
    }

    @Override
    public Teacher selectByPrimaryKey(String id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Teacher record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Teacher record) {
        return 0;
    }

    @Override
    public TeacherVO getTeacher(TeacherVO teacherVO) {
        return teacherMapper.getTeacher(teacherVO);
    }
}
