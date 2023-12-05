package org.tbp.example6.solution;

public class PatientSummaryGenerator {
    // Now Name, Age, HealthCondition are first class business objects
    // hence have the ability to return the formatted data.
    // Summary generator just need to focus on managing the overall
    // structure of the report, not each object level.
    public String generateSummary(Patient patient) {
        return "Patient: " + patient.getName() + ", Age: " + patient.getAge() +
                ", Health Condition: " + patient.getHealthCondition();
    }
}
