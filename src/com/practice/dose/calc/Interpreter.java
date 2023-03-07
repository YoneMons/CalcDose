package com.practice.dose.calc;

public class Interpreter {
    String msg;
    public String evaluation(double drugDoseRecommendation){
        if(drugDoseRecommendation >= 1000 && drugDoseRecommendation <= 2000 ){
            msg = "The recommended dose is: ";
        } else if (drugDoseRecommendation >= 2001 && drugDoseRecommendation <= 3000 ) {
            msg = "The recommended dose is: ";
        } else if (drugDoseRecommendation >= 3001 && drugDoseRecommendation <= 4000) {
            msg = "The recommended dose is: ";
        } else if (drugDoseRecommendation >= 4001 && drugDoseRecommendation <= 5000) {
            msg = "The recommended dose is: ";
        }else{
            msg = "The recommended dose is: ";
        }
        return  msg;
    }
}
