package com.ff.javaoop.day1;
//2.写一个工具类(自定义名称)存储一些常用的方法
//	 2.1定义方法，判断一个整数是奇数还是偶数
//	      要求:传入一个整数
//	           返回一个字符串类型的结果(奇数/偶数)
//     2.2定义方法，
//	   参数为姓名，年龄，如果年龄大于等于80，返回免费参观,
//		如果年龄位于50到80之间，返回票价50元，如果年龄小于50岁，返回票价100元.
import java.util.Scanner;

public class Tool {
    public void JudgeNum(int i) {
        if (i % 2 == 0) {
            System.out.println("是偶数");
        } else {
            System.out.println("是奇数");
        }
    }

    public void BuyTicket(String name,int age){
        if(age>=80){
            System.out.println("免费参观");
        }else if(age>=50){
            System.out.println("票价为50");
        }else {
            System.out.println("票价为100");
        }
    }
 }

