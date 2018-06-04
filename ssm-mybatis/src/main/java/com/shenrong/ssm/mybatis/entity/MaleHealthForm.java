package com.shenrong.ssm.mybatis.entity;

public class MaleHealthForm {
    private String prostate;

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }

    @Override
    public String toString() {
        return "MaleHealthForm{" +
                "prostate='" + prostate + '\'' +
                '}';
    }
}
