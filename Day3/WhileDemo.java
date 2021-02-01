package com.ff.java.Day3;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
       /* int i=0;
       while(i<5){
            System.out.println(i);
            i++;
            }
            */
      //死循环
            while(true){
                System.out.println("死循环");
            }
            /*
            do...while循环
            先执行后判断
            */
        /*int i = 0;
        do {
            System.out.println(i);
            i++;
        }while(i<5);

      /* int i = 0;
        do {
            i++;
            System.out.println(i);
        }while(i<5);*/
//        int i=0;
//        do{
//            Scanner s=new Scanner(System.in);
//            System.out.println("请输入一个数字");
//            i=s.nextInt();
//        }while(i>5);
//        System.out.println("你当前输入的数字小于等于5");
    }

}
