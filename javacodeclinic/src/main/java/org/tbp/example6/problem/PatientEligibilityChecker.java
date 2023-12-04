package org.tbp.example6.problem;

public class PatientEligibilityChecker {
    public boolean isEligibleForSeniorCare(Patient patient) {
        return patient.getAge() >= 65;
    }

    public boolean isEligibleForYouthPrograms(Patient patient) {
        return patient.getAge() < 18;
    }
}

