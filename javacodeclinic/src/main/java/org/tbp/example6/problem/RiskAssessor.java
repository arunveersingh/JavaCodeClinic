package org.tbp.example6.problem;

public class RiskAssessor {
    public String assessRisk(Patient patient) {
        // ??????????????????????????????????????????????????????????????????????????
        // Problem:
        // Single Responsibility Principle (SRP): The PatientEligibilityChecker class
        // is handling the eligibility criteria for different age groups, which can
        // be seen as multiple reasons for it to change.
        // If the eligibility criteria for senior care or youth programs change,
        // this class has to be modified.
        //
        // Encapsulation: The patient's age is a critical piece of data that belongs
        // to the patient. By having the eligibility check outside the Patient class,
        // we're exposing this detail and potentially allowing multiple points in the system to make decisions based on it.
        // PatientEligibilityChecker can determine whether the person is senior or not
        // without even knowing the age.
        //
        // Cohesion: The Patient class is naturally more cohesive if it contains
        // information and behaviors directly related to the patient, such as
        // determining eligibility for age-specific programs.
        // This aligns behaviors (eligibility checks) with the data they operate on (age).
        if (patient.getAge() >= 65 || patient.getHealthCondition().equals("Chronic")) {
            return "High";
        } else if (patient.getAge() >= 45) {
            return "Medium";
        } else {
            return "Low";
        }
    }
}

