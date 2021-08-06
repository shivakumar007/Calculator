package com.calculator;

public class StringCalculator {
    public static int Add(String numbers){
        if(numbers.equals(" ")||numbers.equals("")) {
            return 0;
        }
        String[] numberList=numbers.split(",");
        int sum=0;
        for(int i=0;i<numberList.length;i++){
            sum=sum+Integer.parseInt(numberList[i]);
        }
        return sum;
    }

}
