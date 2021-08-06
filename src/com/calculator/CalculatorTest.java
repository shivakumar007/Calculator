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

        //test for single seperator
        System.out.println(StringCalculator.Add("//;1;2")==3);
        System.out.println(StringCalculator.Add("//%1%3")==4);

        //test for long length seperators(deliminators)
        System.out.println(StringCalculator.Add("//[***]\n1***2***3")==6);
        System.out.println(StringCalculator.Add("//[%%]\n1%%2%%4")==7);

        //test for multiple seperators
        System.out.println(StringCalculator.Add("//[*][%]\n1*2%5")==8);
        System.out.println(StringCalculator.Add("//[**][%%%][&]\n3%%%4**5&6")==18);

        //test for checkimg Integers are less than 1000
        System.out.println(StringCalculator.Add("2,1001")==2);
        System.out.println(StringCalculator.Add("//+\n3+1007")==3);

    }
}
