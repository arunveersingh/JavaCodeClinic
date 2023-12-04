package org.tbp.example6.solution;

public class PatientSummaryGenerator {
    public String generateSummary(Patient patient) {
        return "Patient: " + patient.getName() + ", Age: " + patient.getAge() +
                ", Health Condition: " + patient.getHealthCondition();
    }
}
