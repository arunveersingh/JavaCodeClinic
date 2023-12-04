package org.tbp.example6.solution;

import java.time.LocalDateTime;
import java.time.Period;

public class CheckUpHistory {
    private LocalDateTime lastCheckupDate;

    public LocalDateTime getLastCheckupDate() {
        return lastCheckupDate;
    }

    public void setLastCheckupDate(LocalDateTime lastCheckupDate) {
        this.lastCheckupDate = lastCheckupDate;
    }

    public boolean isDueForCheckup() {
        // Assuming a check-up is due yearly
        LocalDateTime oneYearAgo = LocalDateTime.now().minus(Period.ofYears(1));
        return lastCheckupDate.isBefore(oneYearAgo);
    }
}
