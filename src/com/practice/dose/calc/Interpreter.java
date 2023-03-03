package com.practice.dose.calc;

public class Interpreter {
    
    String msg;
    public String evaluation(double weight){
        if(weight >= 4 && weight <= 8 ){
            msg = "The recommended dose is: ";
        } else if (weight >= 9 && weight <= 12 ) {
            msg = "The recommended dose is: ";
        } else if (weight >= 13 && weight <= 17) {
            msg = "The recommended dose is: ";
        } else if (weight >= 18 && weight <= 24) {
            msg = "The recommended dose is: ";
        }else{
            msg = "The recommended dose is: ";
        }
        return  msg;
    }
}
