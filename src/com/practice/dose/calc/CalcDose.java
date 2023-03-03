package com.practice.dose.calc;

public class CalcDose {

    public double calculateDose(double weight, double drugDose, int drugFrecuency){
        return weight * drugDose / drugFrecuency;
    }
}
