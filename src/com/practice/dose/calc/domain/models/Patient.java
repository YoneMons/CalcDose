package com.practice.dose.calc.domain.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Patient {
    private int patientId;
    private String patientName;
    private double weight;
    private double height;
    private boolean hasCondition;

    private LocalDateTime registrationDateTime;

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
        if (weight < 0) {
            throw new IllegalArgumentException("weight can't be negative");
        }
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("height can't be negative");
        }
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
        if (patientName == null || registrationDateTime == null) {
            throw new NullPointerException("Patient Name or Registration Date Time is null");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = registrationDateTime.format(formatter);
        return "The Patient: " + patientName + " received a dose on: " + formattedDateTime;

    }
}
