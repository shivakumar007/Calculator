package com.calculator;

public class StringCalculator {
    public static int Add(String numbers) throws Exception{
        if(numbers.equals(" ")||numbers.equals("")) {
            return 0;
        }
        String[] seperators=new String[]{"\\+","\\*","x","\\^","X"};
        for(String each:seperators){
            numbers=numbers.replaceAll("["+each+"+]",";");
        }
        String seperator=",";
        if(numbers.startsWith("//")){
            if(numbers.contains("[")&&numbers.contains("]")){
                while (numbers.contains("[")&&numbers.contains("]")){
                    int start=numbers.indexOf("[");
                    int end=numbers.indexOf("]");
                    seperator=numbers.substring(start+1,end);
                    numbers=numbers.substring(end+1).replaceAll(seperator,";");
                    seperator=";";
                }
            }
            else {
                seperator=""+numbers.charAt(2);
                numbers=numbers.substring(3);
            }
        }

        numbers=numbers.replaceAll("\n","");
        String[] numberList=numbers.split(seperator);
        seperator=";";
        String negative="";
        int sum=0;
        for(int i=0;i<numberList.length;i++){
            if(Integer.parseInt(numberList[i])<1000) {
                sum=sum+Integer.parseInt(numberList[i]);
            }
            if(Integer.parseInt(numberList[i])<0){
                negative=negative+numberList[i]+" ";
            }
        }
        if(negative.length()>0){
            throw new Exception("negatives not allowed "+negative);
        }

        return sum;
    }

}
