package org.tbp.example6.solution;

public class Age {
    Integer value;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    // Solution:
    // All the age related stuff is here.
    // Nobody need to know the actual age.
    public boolean isSenior() {
        return value >= 65;
    }

    public boolean isYouth() {
        return value < 18;
    }

    public boolean isMidAge() {
        return value >= 45;
    }

    // Solution: toString method can return formatted date.
    // Can have dedicated methods to do so.
    @Override
    public String toString() {
        return value.toString() + " " + "years";
    }
}
