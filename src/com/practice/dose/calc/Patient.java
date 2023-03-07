package com.practice.dose.calc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Patient {
    private int patientId;
    private String patientName;
    private double weight;
    private double height;
    private boolean hasCondition;

    private LocalDateTime registrationDateTime;

//    static {
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        String formattedDateTime = now.format(formatter);
//        System.out.println("Program started at: " + formattedDateTime);
//    }

    public Patient(String patientName, double weight) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.weight = weight;
        this.height = height;
        this.hasCondition = hasCondition;
        this.registrationDateTime = LocalDateTime.now();
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

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = registrationDateTime.format(formatter);
        return "The Patient: " + patientName + " was register at: " + formattedDateTime;

    }
}
