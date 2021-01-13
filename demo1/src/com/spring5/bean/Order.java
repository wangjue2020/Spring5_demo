package com.spring5.bean;

public class Order {
    private String oderNum;
    private String company;

    public Order(String oderNum, String company) {
        this.oderNum = oderNum;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oderNum='" + oderNum + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
