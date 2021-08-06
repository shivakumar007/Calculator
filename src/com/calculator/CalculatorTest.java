package com.calculator;

public class CalculatorTest {
    public static void main(String[] args){
        //test for empty string
        System.out.println(StringCalculator.Add("")==0);
        System.out.println(StringCalculator.Add(" ")==0);

        //test for single integer
        System.out.println(StringCalculator.Add("1")==1);
        System.out.println(StringCalculator.Add("2")==2);

    }
}
