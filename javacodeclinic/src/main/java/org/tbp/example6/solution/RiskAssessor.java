package org.tbp.example6.solution;

public class RiskAssessor {
    public String assessRisk(Patient patient) {
        if (patient.getAge() >= 65 || patient.getHealthCondition().equals("Chronic")) {
            return "High";
        } else if (patient.getAge() >= 45) {
            return "Medium";
        } else {
            return "Low";
        }
    }
}

