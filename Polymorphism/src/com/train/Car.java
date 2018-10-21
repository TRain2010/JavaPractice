package com.train;

/**
 * Created by T-RAIN on 2018/6/16.
 */
public class Car {

    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;
    private int curCylinder;

    public int getCurCylinder() {
        return curCylinder;
    }

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
        this.curCylinder = 0;
        System.out.println("Car name: " + "name");

    }

    public void startEngine() {
        this.engine = true;
    }

    public void accelerate() {
        if (curCylinder < cylinders) {
            curCylinder ++;
        } else {
            System.out.println("Max speed. ");
        }
    }
    public void brake () {
        if ()
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}
