package com.demo.vo;

import com.demo.common.vo.BaseVO;

/**
 * @author mjh
 * @date 2018/7/11 22:14
 */
public class TeacherVO extends BaseVO{

    private static final long serialVersionUID = -2302051362429956479L;
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "TeacherVO{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
