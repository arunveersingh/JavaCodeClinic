package com.oopsfeedmecode.example6.solution;

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

    // Solution: A patient's checkup history keeper is the right place/person to decide
    // whether checkup is needed or not. Check up history is something which should have
    // all the data to decide... so no one out of this class need to know much. Hence
    // better encapsulation.
    public boolean isDueForCheckup() {
        // Assuming a check-up is due yearly
        LocalDateTime oneYearAgo = LocalDateTime.now().minus(Period.ofYears(1));
        return lastCheckupDate.isBefore(oneYearAgo);
    }
}
