package org.tbp.example6.solution;

public class HealthCondition {
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isChronic() {
        return "Chronic".equals(status);
    }

    @Override
    public String toString() {
        return getStatus();
    }
}
