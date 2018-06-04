package com.shenrong.ssm.mybatis.entity;

public class FemaleEmployee extends Employee{
    private FemaleHealthForm femaleHealthForm;

    public FemaleHealthForm getFemaleHealthForm() {
        return femaleHealthForm;
    }

    public void setFemaleHealthForm(FemaleHealthForm femaleHealthForm) {
        this.femaleHealthForm = femaleHealthForm;
    }

    @Override
    public String toString() {
        return "FemaleEmployee{" +
                "femaleHealthForm=" + femaleHealthForm +
                '}';
    }
}
