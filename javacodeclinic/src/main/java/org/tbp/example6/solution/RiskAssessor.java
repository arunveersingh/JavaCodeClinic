package org.tbp.example6.solution;

public class RiskAssessor {
    public String assessRisk(Patient patient) {
        if (patient.getAge().isSenior() || patient.getHealthCondition().isChronic()) {
            return "High";
        } else if (patient.getAge().isMidAge()) {
            return "Medium";
        } else {
            return "Low";
        }
    }
}

