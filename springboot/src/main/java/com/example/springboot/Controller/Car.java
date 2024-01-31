package com.example.springboot.Controller;

public class Car {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0){
            this.speed =0;
        }
        else{
            this.speed = speed;
        }
    }

    


    
}
