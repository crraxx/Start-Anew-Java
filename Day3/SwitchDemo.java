package com.ff.java.Day3;
public class SwitchDemo {
    /*
   控制语句
   if语句
   if...else语句
   if...else if...else if ...else语句
   switch:多分支选择语句，根据表达式的值来执行多个操作中的一个
   switch中的表达式可以是byte，short，int，char，枚举类型等，JDK7以后，可以使用String
     case语句后面只能使用常量表达式
     case：后面的值不能重复
     */
    public static void main(String[] args) {
        int day=1;
        switch (day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 0:
                System.out.println("星期天");
                break;
            default:
                System.out.println("不合法的日期");


                /*Scanner s = new Scanner(System.in);
                System.out.println("请输入0-7");
                int num= s.nextInt();
               // if(s>=0&&s<=7){
                    */
                }
        }

    }

