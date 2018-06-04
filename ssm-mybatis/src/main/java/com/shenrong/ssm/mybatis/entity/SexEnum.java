package com.shenrong.ssm.mybatis.entity;

import com.sun.org.apache.regexp.internal.REUtil;

public enum SexEnum {

    MALE(1, "男"),
    FEMALE(2, "女");

    private int id;
    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    SexEnum(int id, String sex) {
        this.id = id;
        this.sex = sex;
    }

    SexEnum() {
    }

    public SexEnum getSexById(int id) {
        for (SexEnum sex : SexEnum.values()) {
            if (sex.getId() == id) {
                return sex;
            }
        }
        return null;
    }
}

