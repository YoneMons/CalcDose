package com.practice.dose.calc;

import java.util.stream.Stream;

public class Medicines extends MedicalPrescription{

    int inventary;

    public Medicines(String drugName, double drugDose, int drugFrecuency, int inventary) {
        super(drugDose, drugFrecuency);
        this.inventary = inventary;
    }

    public int getInventary() {
        return inventary;
    }

    public void setInventary(int inventary) {
        this.inventary = inventary;
    }
}
