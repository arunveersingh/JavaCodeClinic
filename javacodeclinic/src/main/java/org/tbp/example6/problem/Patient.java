package org.tbp.example6.problem;

import java.time.LocalDateTime;
import java.time.Period;

public class Patient {
    private String name;
    private String healthCondition;
    private int age;
    private LocalDateTime lastCheckupDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getLastCheckupDate() {
        return lastCheckupDate;
    }

    public void setLastCheckupDate(LocalDateTime lastCheckupDate) {
        this.lastCheckupDate = lastCheckupDate;
    }

    public boolean isDueForCheckup() {
        // Assuming a check-up is due yearly
        LocalDateTime oneYearAgo = LocalDateTime.now().minus(Period.ofYears(1));
        return lastCheckupDate.isBefore(oneYearAgo);
    }
}

