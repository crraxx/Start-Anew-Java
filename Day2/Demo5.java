package com.ff.java.Day2;

public class Demo5 {
    public static void main(String[] args) {
       /*char型
    字符表示一个字符，使用单引号表示
    字符串使用双引号表示
    */
       char c = 'a';
       char c1 = '中';
       char c2 = '\n';
       //字符串的运算，给字符a加0，可转化为Unicode编码表中a的对应的值
        System.out.println(c+0);
        System.out.println(c1+0);
       /*
      计算机中如何显示字符：
      计算机中所有的数据都是二进制存储

      通过人为定义的编码解决：
      最早是美国人指定的ASCII表，只有英文字母和标点符号
      后来出现后GBK GB2312

      为了容纳全球所有文字：
      Unicode编码 采用2字节存储 java底层存储使用的是Unicode编码
      utf-8 为了在文件存储，网络传输是使用的是utf-8
      特点：长度可变，英文使用1字节，中文3字节
        */
    }

}
