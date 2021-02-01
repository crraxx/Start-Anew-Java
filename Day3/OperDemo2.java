package com.ff.java.Day3;

public class OperDemo2 {
            /*比较运算
            ==，!=,<,>,<=,>=
            ==，!=可进行数值与数值，布尔与布尔，引用类型与引用类型之间的比较
            <,>,<=,>=可进行数值与数值间的比较
            */
            public static void main(String[] args) {
                int a=5;
                int b=10;
                int c=15;
                System.out.println(a>b);
                System.out.println(a==b);
                System.out.println(a!=b);
                System.out.println(a<b);

                boolean d=true;
                boolean e=false;
                System.out.println(d==e);
                System.out.println(d!=e);

                String s="abc";
                String s1="abd";
                System.out.println(s==s1);
                System.out.println(s!=s1);
            }
}
