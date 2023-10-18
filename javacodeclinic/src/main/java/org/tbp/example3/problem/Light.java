package org.tbp.example3.problem;

// Light object supporting
// "Tell, Don't Ask"
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





