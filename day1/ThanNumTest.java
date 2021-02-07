package com.ff.javaoop.day1;

import java.util.Scanner;

public class ThanNumTest {
    public static void main(String[] args) {
        ThanNum thanNum = new ThanNum();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        thanNum.thanNum( a, b);
        thanNum.thanNum( a, b,c);

        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        thanNum.thanNum(d,e);
        thanNum.thanNum(d,e,f);
    }
}
