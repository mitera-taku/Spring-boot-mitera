package com.example.springboot.Controller;

// import org.springframework.ui.Model;

public class Member {
    private String name;
    private String age;
    private String comment;
    private String money;
    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + ", comment=" + comment + ", money=" + money + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getMoney() {
        return money;
    }
    public void setMoney(String money) {
        this.money = money;
    }
}
