package com.demo.service;

import com.demo.vo.TeacherVO;
import com.demo.vo.entity.Teacher;

/**
 * @author mjh
 * @date 2018/7/13 22:16
 */
public interface ITeacherService {
    int deleteByPrimaryKey(String id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    TeacherVO getTeacher(TeacherVO teacherVO);
}
