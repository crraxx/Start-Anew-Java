package com.ff.javaoop.day3;
/*
访问权限修饰符（public，protected，default和private）
pubilc 可修饰类，方法，属性  可以被任意类访问
protected 可修饰 方法和属性 包中访问，若不是同包类，则必需是该类的子类才可以访问
default 默认的 只能在同一个包中访问
private私有的 可修饰属性，方法，内部类  只能在本类中访问

 */
public class Demo1 {
    public int pub;
    public int pro;
    int def;
    private int pri;

   public void pub() {

    }
    protected void pro(){

    }
    void def(){

    }
    private void pri(){

    }

    public void test() {
        Demo1 d = new Demo1();
        System.out.println(d.pub);
        d.pub();

        System.out.println(d.pro);
        d.pro();

        System.out.println(d.def);
        d.def();

        System.out.println(d.pri);
        d.pri();
    }


}
