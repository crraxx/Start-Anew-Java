package com.ff.java.Day3;

public class OperDemo3 {
    /*逻辑运算符
    & ，|，！
    &&，||，^
   &&称为逻辑与或者短路与，当遇到false时短路，后面的表达式不在执行
   ||称为逻辑或或者短路或，当遇到true时短路，后面的表达式不在执行
     */
    public static void main(String[] args) {
        int a=15;
        int b=10;
        int c=5;
        /*System.out.println(a>b & b>c);
        //System.out.println(a<b & b>c);
        System.out.println(a<b & ++b>c);
        System.out.println(b);*/

        System.out.println(a>b &&b>c);
        //System.out.println(a<b && b>c);
        System.out.println(a<b && ++b>c);
        System.out.println(b);
        /* 异或运算^
            非运算！
        * */
        boolean m=true;
        boolean n=false;
        System.out.println(!m);
        System.out.println(m^n);
    }


}
