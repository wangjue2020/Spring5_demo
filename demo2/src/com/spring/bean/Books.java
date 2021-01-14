package com.spring.bean;

import java.util.List;

public class Books {
    private List<String> book;

    public void initMethod(){
        System.out.println("initiating...");
    }

    public void destoryMethod(){
        System.out.println("destroying...");
    }
    @Override
    public String toString() {
        return "Books{" +
                "book=" + book +
                '}';
    }

    public void setBook(List<String> book) {
        this.book = book;
    }
}
