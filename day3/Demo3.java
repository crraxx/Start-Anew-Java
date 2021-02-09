package com.ff.javaoop.day3;
/*
在同一个包的不同类中
private不能被访问，private只能在自己所在类中被访问
其余均可以被访问
 */
public class Demo3 {
    public static void main(String[] args) {
            Demo1 d = new Demo1();
            System.out.println(d.pub);
            d.pub();

            System.out.println(d.pro);
            d.pro();

            System.out.println(d.def);
            d.def();

        /*System.out.println(d.pri);
        d.pri();     */
    }

    }
