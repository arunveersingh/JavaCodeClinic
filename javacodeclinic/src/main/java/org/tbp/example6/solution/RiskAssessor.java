package org.tbp.example6.solution;

public class RiskAssessor {
    // Risk Assessor need not more than needed data.
    // So basically, we are telling patient/age/healthcondition
    // objects to do job for us. We want to tell the objects
    // "what to do" instead of "asking information and taking decision".
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

