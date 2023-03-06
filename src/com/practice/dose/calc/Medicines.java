package com.practice.dose.calc;

public class Medicines extends MedicalPrescription{

    int inventary;

    public Medicines(double drugDose, int drugFrecuency, int inventary) {
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
