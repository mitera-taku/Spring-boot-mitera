package com.example.springboot.Controller;

import java.util.List;

public class User2 {
    private String name;
    private List<String> hobbylist;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getHobbylist() {
        return hobbylist;
    }
    public void setHobbylist(List<String> hobbylist) {
        this.hobbylist = hobbylist;
    }
}
