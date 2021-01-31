package com.ff.java.Day2;

public class Demo3 {
    /*
        变量按数据类型分类
            基本数据类型
            引用数据类型
         按位置:
         成员变量
         局部变量
         */
    public static void main(String[] args) {
        //byte 占1字节  -128到+127
        // byte m=128;
        byte m=127;

        //short 占2个字节
        short s=32767;

        //int 占4字节
        int i=1000000000;
        //输出int型表示的最大范围
        System.out.println(Integer.MAX_VALUE);

        //long 占8个字节
        //整数字面量默认为int类，如要声明一个常量为long型则需要在数字后面加L或者l
        //long n = 2147483648;
        long n = 2147483648l;


        //ob开头表示为二进制，因此a的值为3
        //0表示为八进制，因此b的值为13
        //0x表示十六进制，因此c的值为21
        int a=0b11;
        int b=015;
        int c=0x15;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //float 4字节 由于顶层二进制存储方式的的不同，4字节的float表数范围大于8字节的long
        float f= n;

        //double 8字节
        double d=10.4;
        //数据类型按容量大小排序为：byte,short,char->int ->long->float->double

    }


}

