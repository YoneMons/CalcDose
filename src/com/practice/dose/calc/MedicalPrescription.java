package com.practice.dose.calc;

public class MedicalPrescription {
    private int medicalPrescriptionId;
    private String drugName;
    private double drugDose;
    private int drugFrecuency;
    private double drugDoseRecommendation;

    public MedicalPrescription(String drugName, double drugDose, int drugFrecuency) {
        this.medicalPrescriptionId = 1;
        this.drugName = drugName;
        this.drugDose = drugDose;
        this.drugFrecuency = drugFrecuency;
    }

    public int getMedicalPrescriptionId() {
        return medicalPrescriptionId;
    }

    public void setMedicalPrescriptionId(int medicalPrescriptionId) {
        this.medicalPrescriptionId = medicalPrescriptionId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public double getDrugDose() {
        return drugDose;
    }

    public void setDrugDose(double drugDose) {
        this.drugDose = drugDose;
    }

    public int getDrugFrecuency() {
        return drugFrecuency;
    }

    public void setDrugFrecuency(int drugFrecuency) {
        this.drugFrecuency = drugFrecuency;
    }

    public double getDrugDoseRecommendation() {
        return drugDoseRecommendation;
    }

    public void setDrugDoseRecommendation(double drugDoseRecommendation) {
        this.drugDoseRecommendation = drugDoseRecommendation;
    }

    @Override
    public String toString() {
        return "MedicalPrescription{" +
                "medicalPrescriptionId=" + medicalPrescriptionId +" \n " +
                ", drugName='" + drugName + '\'' + "\n" +
                ", drugDose=" + drugDose + "\n" +
                ", drugFrecuency=" + drugFrecuency + "\n" +
                ", drugDoseRecommendation=" + drugDoseRecommendation + "\n" +
                '}';
    }
}
