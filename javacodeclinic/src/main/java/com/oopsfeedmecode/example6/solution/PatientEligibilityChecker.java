package com.oopsfeedmecode.example6.solution;

public class PatientEligibilityChecker {
    // Solution:
    // now PatientEligibilityChecker need not know the
    // exact age to decide... Age class is the centralized place
    // to take such decisions.
    public boolean isEligibleForSeniorCare(Patient patient) {
        return patient.getAge().isSenior();
    }

    public boolean isEligibleForYouthPrograms(Patient patient) {
        return patient.getAge().isYouth();
    }
}

