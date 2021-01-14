package com.spring.autowire;

public class Employee {
    private Department dept;

    @Override
    public String toString() {
        return "Employee{" +
                "dept=" + dept +
                '}';
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }
}
