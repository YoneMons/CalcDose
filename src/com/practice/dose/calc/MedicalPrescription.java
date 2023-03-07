package com.practice.dose.calc;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MedicalPrescription {
    private int medicalPrescriptionId;
    private String drugName;
    private double drugDose;
    private int drugFrecuency;
    private double drugDoseRecommendation;

    public MedicalPrescription(double drugDose, int drugFrecuency) {
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

    public String getDrugName(String drugName) {
        return this.drugName;
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

    public String getMedicineList() {
        return Stream.of("Aspirin", "Paracetamol", "Ibuprofen")
                .filter(medicineStream -> medicineStream.length() > 3)
                .sorted()
                .collect(Collectors.joining(", "));
    }

    @Override
    public String toString() {
        return "\n" + "     Medical Prescription     " + "\n" +
                "Medical Prescription Id: " + medicalPrescriptionId +" \n " +
                "Drug Name: '" + drugName + '\'' + "\n" +
                "Drug Dose: " + drugDose + "\n" +
                "Drug Frecuency: " + drugFrecuency + "\n" +
                "Drug Dose Recommendation: " + drugDoseRecommendation + "\n" +
                "List of Medicines on inventory: " + getMedicineList();
    }
}
