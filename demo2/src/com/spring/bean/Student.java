package com.spring.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String[] classArray;
    private List<String> classList;
    private Map<String, String> classMap;
    private Set<String> classSet;
    private List<Course> courseList;

    @Override
    public String toString() {
        return "Student{" +
                "classArray=" + Arrays.toString(classArray) +
                ", classList=" + classList +
                ", classMap=" + classMap +
                ", classSet=" + classSet +
                ", courseList=" + courseList +
                '}';
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setClassArray(String[] classArray) {
        this.classArray = classArray;
    }

    public void setClassList(List<String> classList) {
        this.classList = classList;
    }

    public void setClassMap(Map<String, String> classMap) {
        this.classMap = classMap;
    }

    public void setClassSet(Set<String> classSet) {
        this.classSet = classSet;
    }
}
