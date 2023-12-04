package org.tbp.example6.problem;

public class CheckupScheduler {
    public void scheduleCheckupIfNeeded(Patient patient) {
        if (patient.isDueForCheckup()) {
            System.out.println("Patient " + patient.getName() + " is due for a check-up. Scheduling...");
            // Logic to schedule the check-up
        } else {
            System.out.println("Patient " + patient.getName() + " is not due for a check-up.");
        }
    }
}

