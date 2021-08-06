package com.calculator;

public class CalculatorTest {
    public static void main(String[] args){
        //test for empty string
        System.out.println(StringCalculator.Add("")==0);
        System.out.println(StringCalculator.Add(" ")==0);

        //test for single integer
        System.out.println(StringCalculator.Add("1")==1);
        System.out.println(StringCalculator.Add("2")==2);

        //test for multiple integers in string with comma as seperator
        System.out.println(StringCalculator.Add("1,2")==3);
        System.out.println(StringCalculator.Add("1,2,3,4,5")==15);

    }
}
