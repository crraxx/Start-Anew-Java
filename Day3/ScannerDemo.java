package com.ff.java.Day3;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num=s.nextInt();
        System.out.println(num);

        Scanner name=new Scanner(System.in);
        System.out.println("请输入姓名：");
        String s1=name.next();
        System.out.println(s1);
    }
}
