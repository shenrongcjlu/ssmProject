package com.shenrong.ssm.mybatis.entity;

public class MaleEmployee extends Employee{
    MaleHealthForm maleHealthForm;

    public MaleHealthForm getMaleHealthForm() {
        return maleHealthForm;
    }

    public void setMaleHealthForm(MaleHealthForm maleHealthForm) {
        this.maleHealthForm = maleHealthForm;
    }

    @Override
    public String toString() {
        return "MaleEmployee{" +
                "maleHealthForm=" + maleHealthForm +
                '}';
    }
}
