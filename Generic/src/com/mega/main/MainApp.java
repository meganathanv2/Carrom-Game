package com.mega.main;

import com.mega.model.Box;
import com.mega.model.Pair;
import com.mega.service.Calculator;
import com.mega.util.PrintUtil;

public class MainApp {

    public static void main(String[] args) {

        Box<Integer> b = new Box<>();
        b.setValue(100);
         System.out.println(b.getValue());
        Box<String> b1=new Box<>();
       
        b1.setValue("check");
        System.err.println(b1.getValue());

        Pair<Integer, String> pair = new Pair<>(1, "Java");
        pair.display();

        Calculator<Double> calc = new Calculator<>();
        System.out.println("Square: " + calc.square(5.5));

        PrintUtil.print("Generic Method");
        PrintUtil.print(999);
    }
}
