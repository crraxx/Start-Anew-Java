package com.ff.javaoop.day1;
//4.定义一个银行类，
//  属性:账号、密码、存款余额,银行名称。
//  方法:创建账号、存款、取款、查询。
//  创建该类对象并测试
public class Bank {
    String account;
    String password;
    float balance;
    String backName;
    int sum;
    public void creatAccount(String acccount,String password,String backName){
        System.out.println("恭喜您账户创建成功");
    }
    public void deposit(int s1){
        sum = sum+s1;
        System.out.println("存款："+s1+"元");
    }
    public void withdrawal(int s2){
        if(sum-s2<0){
            System.out.println("账户余额不足");
        }else{
            sum-=s2;
            System.out.println("取款："+s2+"元");
        }
    }
    public void demand(){
        System.out.println("您账户中的总余额为："+sum);
    }
}
