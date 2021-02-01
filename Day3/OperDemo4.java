package com.ff.java.Day3;

public class OperDemo4 {
    /*
    赋值运算符

    */
    /*
    条件运算符（条件表达式）？表达式1：表达式2
    */
    public static void main(String[] args) {
        int i=10;
        i=i+5;
       short x=10;
      // x=x+2;由于数据类型的不同
       x+=2;

        boolean b1 = false;//区分好==和=的区别。
        if(b1==true){
            System.out.println("结果为真");
        }else{
            System.out.println("结果为假");
        }

        boolean b2 = false;
        if(b2=true){
            System.out.println("结果为真");
        }else{
            System.out.println("结果为假");
        }

        int y = 1;
        y*= 0.1;
        System.out.println(y);
        y++;
        System.out.println(y);

        int y1 = 1;
        y1++;
        y1*= 0.1;
        System.out.println(y1);

//        int a=50;
//        String s=(a>60)? "及格":"不及格";
//        System.out.println(s);
    }
}
