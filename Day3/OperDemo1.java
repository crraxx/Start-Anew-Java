package com.ff.java.Day3;

public class OperDemo1 {
    /*算术运算符
    + ，-，*，/，%，++，--
    +表示一个正数，表示加法运算，表示字符串连接

    */
    public static void main(String[] args) {
        int a=+5;//"+"表示一个正号
        int b=3;
        System.out.println(a);
        System.out.println(a+b);//"+"表示算术运算加法

        String s="abc";
        String s1="abcd";
        System.out.println(b+s);//"+"表示字符串与数字的连接
        System.out.println(s+s1);//"+"表示字符串与字符串的连接
        int x=10;
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);

/*

        int i1 = 10,i2 = 20;
        int i = i1++;
        System.out.print("i="+i);
        System.out.println("i1="+i1);
        i = ++i1;
        System.out.print("i="+i);
        System.out.println("i1="+i1);

        i = i2--;
        System.out.print("i="+i);
        System.out.println("i2="+i2);
        i = --i2;
        System.out.print("i="+i);
        System.out.println("i2="+i2);
*/

    }


}
