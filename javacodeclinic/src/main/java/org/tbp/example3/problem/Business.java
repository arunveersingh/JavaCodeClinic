package org.tbp.example3.problem;

public class Business {

    // Usage
    // Not following "Tell, Don't Ask"
    void execute(){
        Light light = new Light();

        boolean isLightOn =
                light.getState();

        if (isLightOn) {
            light.turnOff();
        } else {
            light.turnOn();
        }
    }
}









