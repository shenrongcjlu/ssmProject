package com.shenrong.ssm.mybatis.entity;

public class FemaleHealthForm extends HealthForm {
    private String uterus;

    public String getUterus() {
        return uterus;
    }

    public void setUterus(String uterus) {
        this.uterus = uterus;
    }

    @Override
    public String toString() {
        return "FemaleHealthForm{" +
                "uterus='" + uterus + '\'' +
                '}';
    }
}
