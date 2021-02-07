package com.ff.javaoop.day1;
//8.编程  比较大小：分别利用重载，对两个int,
// 两个double，三个int，三个double类型的数进行比较大小,
// 返回其中较大的一个.
public class ThanNum {
    public int thanNum(int a,int b){
        int t=a>b?a:b;
        System.out.println("前两个int型数据较大的为"+t);
        return t;
    }
    public double thanNum(double a,double b){
       double t=a>b?a:b;
        System.out.println("前两个double型数据较大的为"+t);
        return t;
    }
    public int thanNum(int a,int b,int c){
        int t=(t=a>b?a:b)>c?t:c;
        System.out.println("三个int型数据较大的为"+t);
        return t;
    }
    public double thanNum(double a,double b,double c){
        double t=(t=a>b?a:b)>c?t:c;
        System.out.println("三个double型数据较大的为"+t);
        return t;
    }
}
