package com.practice.dose.calc;

public class Interpreter {
    String msg;
    public String evaluation(double drugDoseRecommendation){
        if(drugDoseRecommendation >= 1000 && drugDoseRecommendation <= 2000 ){
            msg = "Apply this dose to this patient: " +drugDoseRecommendation;
        } else if (drugDoseRecommendation >= 2001 && drugDoseRecommendation <= 3000 ) {
            msg = "Apply this dose to this patient: " +drugDoseRecommendation;
        } else if (drugDoseRecommendation >= 3001 && drugDoseRecommendation <= 4000) {
            msg = "Apply this dose to this patient: " +drugDoseRecommendation;
        } else if (drugDoseRecommendation >= 4001 && drugDoseRecommendation <= 5000) {
            msg = "Apply this dose to this patient: " +drugDoseRecommendation;
        }else{
            msg = "Please enter again the data of patient";
        }
        return  msg;
    }
}
