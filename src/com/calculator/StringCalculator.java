package com.calculator;

public class StringCalculator {
    public static int Add(String numbers){
        if(numbers.equals(" ")||numbers.equals("")) {
            return 0;
        }
        return Integer.parseInt(numbers);
    }

}
