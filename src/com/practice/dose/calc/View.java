package com.practice.dose.calc;

import java.util.Scanner;

public class View {

    public Patient executePatient(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter patient name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter patient weight: ");
        double weight = scanner.nextDouble();

        Patient p = new Patient(name, weight);
        return p;
    }
    public MedicalPrescription executePrescription(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter drug name: ");
        String drugName = scanner.nextLine();
        System.out.println("Please enter dose of the Medicine: ");
        double drugDose = scanner.nextDouble();
        System.out.println("Please enter frencuency of the drug: ");
        int drugFrencuency = scanner.nextInt();
        
        Medicines recommendedDrug = new Medicines(100,2,10);
        return recommendedDrug;
        /*MedicalPrescription recommendedDrug = new MedicalPrescription(200,  4);
        return recommendedDrug;*/
    }

    public void displayRecommendedDose(MedicalPrescription mP) {
        System.out.println("The dose recommended for this patient is: " +mP.toString());
    }
}
