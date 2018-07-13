package com.demo.dao.teacher;

import com.demo.vo.TeacherVO;
import com.demo.vo.entity.Teacher;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    int deleteByPrimaryKey(String id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);

    TeacherVO getTeacher(TeacherVO teacherVO);
}