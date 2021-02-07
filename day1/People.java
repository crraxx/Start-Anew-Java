package com.ff.javaoop.day1;

public class People {
    /*
    1.发现类（人类）
    类的语法：[访问权限修饰符] [修饰符] class(修饰类) 类名{

        }
     */
    /*构造方法的特点：
    1.构造方法的名字与类名相同
    2.没有返回值
    3.不能用void修饰
    4.每个类中默认有一个无参的构造方法，也可自己定义一个有参的构造方法。
    一个类中可以有多个构造方法，通过方法的参数来区别。
     */
    /*
    创建一个无参的构造方法（默认）
    每个类中都有一个默认的构造方法，，可显式的表现出来如下，也可以不写出来
     */
    public People() {
        System.out.println("用无参的构造方法创建一个people类");
    }

    /*
    创建带有一个参数的构造方法，一旦创建，无参的构造方法失效
     */
    public People(String n) {
        name = n;
        System.out.println("用带一个参数的构造方法创建一个people类");
    }

    /*
    创建带有两个参数的构造方法。
     */
    public People(String n, int a) {
        name = n;
        age = a;
        System.out.println("用带有两个参数的构造方法创建一个people类");
    }
         /*
          类的属性
          成员变量:定义在类中
          [访问权限修饰符] [修饰符]  数据类型  变量名 = [值]
         */
    String name;
    String six;
    int age;
    int weight;
    int height;
    String hearcolor;

    /*
    变量————方法
    public Static void main (String [a]){

    }
    变量的语法： [访问权限修饰符] [修饰符] [返回值类型]/void 方法名 (参数类型 [参数名]){
    代码块
    [return 值]
    }
     */
    /*
    方法的重载：在同一个类中出现多个方法名相同的现象
    方法名相同时如何区分：
    通过参数来区分：
    1.参数的个数  2.
     */
    public void work() {
        System.out.println("工作");
    }

    public void learn() {
        System.out.println("学习");
    }

    public void learn(String p,int t){
        System.out.println("地点是："+p+"  时间："+t+"点");
    }

    public void learn(int t,String p){
        System.out.println("时间："+t+"点"+"  地点是："+p);
    }
}
