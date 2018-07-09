package com.example.demo.service;

import com.example.demo.vo.TeacherVO;
import com.example.demo.vo.entity.Teacher;

import java.util.List;

/**
 * @author mjh
 * @date 2018/7/7 1:44
 */
public interface ITeacherService {
    /**
     * 新增
     * @param teacherList
     * @return
     */
    int addTeacher(List<Teacher> teacherList);

    /**
     * 更新
     * @param teacherList
     * @return
     */
    int updateTeacher(List<Teacher> teacherList);

    /**
     * 查询
     * @param teacherVO
     * @return
     */
    List<TeacherVO> findTeacher(TeacherVO teacherVO);
}
