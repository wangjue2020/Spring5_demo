package com.spring.bean;

public class Course {
    private String courseName;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
