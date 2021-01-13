package com.spring5.bean;

public class Department {
    private String departmentName;

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
