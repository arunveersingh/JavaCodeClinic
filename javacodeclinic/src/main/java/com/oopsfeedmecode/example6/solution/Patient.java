package com.oopsfeedmecode.example6.solution;

public class Patient {

    // Solution: Promoting field variables to dedicated business
    // objects. And these dedicated object provide needed methods to
    // Provide necessary details.
    // See: Name, HealthCondition, Age, CheckUpHistory
    private Name name;
    private HealthCondition healthCondition;
    private Age age;
    private CheckUpHistory checkUpHistory;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public HealthCondition getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(HealthCondition healthCondition) {
        this.healthCondition = healthCondition;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public CheckUpHistory getCheckUpHistory() {
        return checkUpHistory;
    }

    public void setCheckUpHistory(CheckUpHistory checkUpHistory) {
        this.checkUpHistory = checkUpHistory;
    }
}

