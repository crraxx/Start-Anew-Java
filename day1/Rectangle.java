package com.ff.javaoop.day1;
//3.定义长方形类，含：
//  属性：宽、高（整型）；
//  方法：求周长、面积；
//  进行测试。
public class Rectangle {
    int length;
    int wide;
    int Circle;
    int Perimeter;
    int Area;
    public void Perimeter(int length,int wide){
        Perimeter=2*(length+wide);
        System.out.println("长方形的周长为："+Perimeter);
    }
    public void Area(int length,int wide){
     Area=length*wide;
        System.out.println("长方形的面积为："+ Area);
    }
}
