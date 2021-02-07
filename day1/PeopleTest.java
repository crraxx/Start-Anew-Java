package com.ff.javaoop.day1;

public class PeopleTest {
    /*
    类定义好后就是一个文件，不能直接被使用
    以类为模板创建对象，对象是实例是具体存在的，可以被使用
     */
    public static void main(String[] args) {
        /*
        new People() 中new+people类的构造方法在内存中创建一个具体的people对象
        People wyf 指以People为类型声明一个名为wyf的对象
        = 让 wyf变量指向内存中的对象
         */
        People wyf = new People();
        wyf.name = "王";
        wyf.age = 20;
        wyf.height = 160;
        wyf.learn();
        wyf.work();
        System.out.println(wyf.name + ":" + wyf.age + ":" + wyf.height);

        People xfh = new People();
        xfh.name = "许";
        xfh.age = 21;
        xfh.height = 180;
        xfh.hearcolor = "黑";
        xfh.work();
        xfh.learn();
        System.out.println(xfh.name + ":" + xfh.age + ":" + xfh.height);


        People wh = new People();//无参的构造方法

        People crr = new People("崔");//一个参数的构造方法
        System.out.println(crr.name);//两个参数的构造方法

        People ls = new People("李", 15);
        System.out.println(ls.name + "的年龄是:" + ls.age+"岁");

        wyf.learn();
        wyf.learn("教室",12);

        wyf.learn(12,"教室");

    }
}
