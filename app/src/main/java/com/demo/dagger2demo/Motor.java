package com.demo.dagger2demo;

/**
 * Created by gene on 5/1/2017.
 */

public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 990;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}
