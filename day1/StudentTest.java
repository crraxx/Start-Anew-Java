package com.ff.javaoop.day1;

public class StudentTest {
    public static void main(String[] args) {
        Student w = new Student();
        w.study();
        w.test();
        w.StudentNum = "1821014";
        w.age = 20;
        w.Name = "王一凡";
        w.Sex = "女";
        w.CheaseaGrade = 89;
        w.EnglishGread = 100;
        w.MathGread = 99;
        System.out.println(w.Name+"的学号是:"+w.StudentNum+"  年龄是："+w.age+"  性别是："
                +w.Sex+"  语文成绩是："+w.CheaseaGrade+"  数学成绩是："+w.MathGread+"  英语成绩是："+w.EnglishGread);
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println();
        Student c = new Student();
        c.study();
        c.test();
        c.StudentNum = "1821024";
        c.age = 20;
        c.Name = "崔瑞荣";
        c.Sex = "女";
        c.CheaseaGrade = 89;
        c.EnglishGread = 100;
        c.MathGread = 99;
        System.out.println(c.Name+"的学号是:"+c.StudentNum+"  年龄是："+c.age+"  性别是："
                +c.Sex+"  语文成绩是："+c.CheaseaGrade+"  数学成绩是："+c.MathGread+"  英语成绩是："+c.EnglishGread);
    }

}
