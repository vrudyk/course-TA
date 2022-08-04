package com.company.MainBank;

import com.company.Interfaces.Driveable;

public abstract class Car implements Driveable {
    private String color;
    private String mark;

    public Car() {

    }

    public Car(String color, String mark) {
        this.color = color;
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    //-----------------------------------------

    public void sound() {
        System.out.println("beep-beep");
    }

    public abstract void style();
}
