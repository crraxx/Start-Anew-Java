package com.ff.java.Day3;

public class BreakContinue {
  public static void main(String[] args) {
        int a = 4;
        for (int i = 1; i <= 10; i++) {
            //当i等于a时，退出当前循环
            if (i == a){
                break;
            }
            System.out.println(" i= " + i);
        }
    }
   /*public static void main(String[] args) {
       int b = 4;
       for (int i = 1; i <= 5; i++) {
           //当i等于skip时，跳过当次循环
           if (i ==b){
               continue;
           }
           System.out.println("i = " + i);
       }
     }
       */



}
