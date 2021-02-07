package com.ff.javaoop.day1;
//1.定义一个Student类，
//	属性有学号，姓名，年龄，性别，语文成绩，数学成绩，英语成绩，
//	方法有:学习，考试(打印输出学习,考试即可))
//	创建两个学生对象，并给属性赋值和调用方法
public class Student {

    String StudentNum;
    String Name;
    int age;
    String Sex;
    float CheaseaGrade;
    float MathGread;
    float EnglishGread;

    public void study() {
        System.out.println("学习");
    }

    public void test() {
        System.out.println("考试");
    }
}


