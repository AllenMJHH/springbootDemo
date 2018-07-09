package com.example.demo.dao;

import com.example.demo.vo.TeacherVO;
import com.example.demo.vo.entity.Teacher;

import java.util.List;

public interface TeacherMapper {

    int addTeacher(List<Teacher> teacherList);

    int updateTeacher(List<Teacher> teacherList);

    List<TeacherVO> findTeacher(TeacherVO teacherVO);

}
