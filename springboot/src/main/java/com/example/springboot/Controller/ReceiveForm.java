package com.example.springboot.Controller;

public class ReceiveForm {
    private String name;
    private String age;
    @Override
    public String toString() {
        return "ReceiveForm [name=" + name + ", age=" + age + "]";
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getComment'");
    }
}
