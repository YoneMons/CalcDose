package com.practice.dose.calc;

import com.practice.dose.calc.controller.Controller;
import com.practice.dose.calc.view.View;

public class Runner {
    public static void main(String[] args) {

        View view = new View();
        Controller controller = new Controller(view);
    }
}