package org.tbp.example6.solution;

public class Age {
    Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public boolean isSenior() {
        return value >= 65;
    }

    public boolean isYouth() {
        return value < 18;
    }

    public boolean isMidAge() {
        return value >= 45;
    }

    @Override
    public String toString() {
        return value.toString() + " " + "years";
    }
}
