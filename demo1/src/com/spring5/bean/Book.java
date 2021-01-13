package com.spring5.bean;

/**
 * 用set方法进行注入
 * 1、在class里面要声明属性
 * 2、提供setter方法给每个属性
 */
public class Book {
    //1、在class里面要声明属性
    private String bookName;
    private String author;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    //2、提供setter方法给每个属性
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
