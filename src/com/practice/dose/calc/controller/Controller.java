package com.practice.dose.calc.controller;

import com.practice.dose.calc.CalcDose;
import com.practice.dose.calc.domain.models.MedicalPrescription;
import com.practice.dose.calc.domain.models.Patient;
import com.practice.dose.calc.view.View;

import java.util.ArrayList;

public class Controller {

    ArrayList<Patient> patientList = new ArrayList<Patient>();

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
        patientList.add(p);
        prescription = v.executePrescription();
        try {
            prescription.setDrugDoseRecommendation(calcDose.calculateDose(p.getWeight(), prescription.getDrugDose(), prescription.getDrugFrecuency()));
        }catch (Exception e){
            //handled the exception
        }
        //medicineList.add((Medicines) prescription);
        v.displayRecommendedDose(prescription);
        v.displayPatientInformation(p);
    }
}
