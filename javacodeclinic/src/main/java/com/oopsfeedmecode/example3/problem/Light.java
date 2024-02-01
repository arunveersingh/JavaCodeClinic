package com.oopsfeedmecode.example3.problem;

// Light object not supporting
// "Ask, Then Decide"
public class Light {
    private boolean isOn;
    public boolean getState() {
        return isOn;
    }
    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
}





