package com.practice.dose.calc;

public class Patient {
    private int patientId;
    private String patientName;
    private double weight;
    private double height;
    private boolean hasCondition;

    public Patient(String patientName, double weight) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.weight = weight;
        this.height = height;
        this.hasCondition = hasCondition;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasCondition() {
        return hasCondition;
    }

    public void setHasCondition(boolean hasCondition) {
        this.hasCondition = hasCondition;
    }
}
