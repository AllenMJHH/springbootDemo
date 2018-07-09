package com.example.demo.common.vo;

import java.io.Serializable;

/**
 * @author mjh
 * @date 2018/7/7 1:34
 */
public class BaseVO implements Serializable {
    private static final long serialVersionUID = -3612697687584505965L;
    private String createBy;
    private String createDate;
    private String lastUpdateBy;
    private String lastUpdateDate;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "BaseVO{" +
                "createBy='" + createBy + '\'' +
                ", createDate='" + createDate + '\'' +
                ", lastUpdateBy='" + lastUpdateBy + '\'' +
                ", lastUpdateDate='" + lastUpdateDate + '\'' +
                '}';
    }
}
