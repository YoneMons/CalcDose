package com.practice.dose.calc;

import java.util.ArrayList;

public class Controller {
    View v;
    CalcDose calcDose;
    //Interpreter interp;
    Patient p;
    MedicalPrescription prescription;

    public Controller(View v) {
        this.v = v;
        this.calcDose = new CalcDose();
        //this.interp = interp;
        launcher();
    }

    private void launcher() {
        //calcDose = new CalcDose();
       //interp = new Interpreter();
        p = v.executePatient();
        prescription = v.executePrescription();
        prescription.setDrugDoseRecommendation(calcDose.calculateDose(p.getWeight(), prescription.getDrugDose(), prescription.getDrugFrecuency()));
        v.displayRecommendedDose(prescription);
        v.displayPatientInformation(p);
    }
}
