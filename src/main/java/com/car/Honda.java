package com.car;

public class Honda extends Car {
    private boolean isTurboCharged;
    public Honda(String color, int year, int maxSpeed, boolean isTurboCharged){
        super(color,year,maxSpeed);
        this.isTurboCharged = isTurboCharged;
    }
    public void setisTurboCharged(boolean isTurboCharged){
        this.isTurboCharged = isTurboCharged;
    }
    public boolean getisTurboCharged(boolean isTurboCharged){
        return this.isTurboCharged;
    }
}
