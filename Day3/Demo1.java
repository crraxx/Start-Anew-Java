package com.ff.java.Day3;

public class Demo1 {
    public static void main(String[] args) {
       /* java中有8种基本数据类型，除了布尔类型外其余7种之间可以相互转换
       默认转化:容量小的类型默认转化为容量大的
       byte，short，char<int <long<float<double
       直接转化，因为容量大的完全装的下容量小的
       */
        byte a = 20;
        short b = a;
        int c = b ;
        long d =c ;
        float f = d;
        double g = f;

        /*
        强制类型转化：容量大的转化为容量小的
        问题：1.溢出 2.精度降低
        */

        /*int x = 10;
        byte y =x;*/
        int x = 10;
        byte y = (byte) x;
        //注意：混合运算时，小容量会自动转化为大容量计算
        float z = 12.3f;
        int m =(int) (a+x+z);
        int m1=(int) (z)+x+a;
        System.out.println(d);
        System.out.println(g);
        System.out.println(m);
        System.out.println(m1);

    }
}
