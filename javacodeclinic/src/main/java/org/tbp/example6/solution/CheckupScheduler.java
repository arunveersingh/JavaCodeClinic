package org.tbp.example6.solution;

public class CheckupScheduler {
    public void scheduleCheckupIfNeeded(Patient patient) {
        if (patient.getCheckUpHistory().isDueForCheckup()) {
            System.out.println("Patient " + patient.getName() + " is due for a check-up. Scheduling...");
            // Logic to schedule the check-up
        } else {
            System.out.println("Patient " + patient.getName() + " is not due for a check-up.");
        }
    }
}

