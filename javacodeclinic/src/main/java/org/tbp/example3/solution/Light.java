package org.tbp.example3.solution;

// Light object supporting
// "Ask, Then Decide"
public class Light {
    private boolean isOn;
    public boolean getState() {
        return isOn;
    }
    public void toggle() {
        if (isOn) {
            turnOff();
        } else {
            turnOn();
        }
    }
    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
}





