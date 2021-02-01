package com.ff.java.Day3;

import java.util.Scanner;

public class TestDemo {
    /* public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int day=input.nextInt();
     switch(day){
         case 1:
             System.out.println("今天星期一,工作日");
             break;
         case 2:
             System.out.println("今天星期二,工作日");
             break;
         case 3:
             System.out.println("今天星期三,工作日");
             break;
         case 4:
             System.out.println("今天星期四,工作日");
             break;
         case 5:
             System.out.println("今天星期五,工作日");
             break;
         case 6:
             System.out.println("今天星期六,周末");
             break;
         case 0:
             System.out.println("今天星期日,周末");
             break;
         default:
             System.out.println("输入错误,请输入0-6");
             break;
     }
 }*/
   /*public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       double weight=input.nextDouble();
       double height=input.nextDouble();
       double BMI=weight / (height*height);
       if (BMI<18.5){
           System.out.println("体重过轻");
        }
       else if(BMI<24){
           System.out.println("正常范围");
        }
       else if(BMI<27){
           System.out.println("体重过重");
        }
       else if(BMI<30){
           System.out.println("轻度肥胖");
        }
       else if(BMI<35){
           System.out.println("中度肥胖");
        }
       else{
           System.out.println("重度肥胖");
       }
     }*/
  /* public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("请输入年份：");
       int year=input.nextInt();
       if(year%4==0 && year%100!=0 || year%400==0) {
           System.out.println(year+"是闰年");
       }
       else {System.out.println(year+"不是闰年");}
   }*/
  /* public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int Month = input.nextInt();
           if(Month==3 || Month==4 || Month==5){
               System.out.println("春季");
           }
           else if(Month==6 || Month==7 || Month==8){
               System.out.println("夏季");
           }
           else if(Month==9 || Month==10 || Month==11){
               System.out.println("秋季");
           }
           else if(Month==12 || Month==1 || Month==2){
               System.out.println("冬季");
           }
       }*/
  /* public static void main(String[] args) {
         int sum=0,day=0;
           Scanner input = new Scanner(System.in);
           int high=input.nextInt();
           int up=input.nextInt();
           int down=input.nextInt();
           while(high>0) {
               day++;
               sum+=up;
               if(sum<high) {
                   sum-=down;
               }
               else if(sum==high) {
                   break;
               }
           }
           System.out.println(day);*/
  /* int L=11;
       int S=0;
       int Day=0;
       while(L>=S){
           S+=3;
           if(S>=L){//判断是否爬出
               break;
           }
           S-=2;
           Day++;
       }
       System.out.println("需要："+Day+"天");
       }*/
   /*public static void main(String[] args) {
           System.out.println("第一天摘下来桃子数量："+peaches(10));
           System.out.println("第一天摘下来桃子数量："+f(10));
       }
       //方法一：直接用公式计算
       static int peaches(int day)
       {
           int total;//设桃子的总数
           total=(int)Math.pow(2, day-1)+(int)Math.pow(2, day)-2;
           return total;

       //方法二：递推公式
       static int f(int n) //n表示距离现在的天数
       {
           if(n==1)
           {
               return 1;
           }
           else
           {
               return 2*f(n-1)+2;
           }
       }*/
  /* public static void main(String[] args) {
       for (int i = 1; i <=100; i++) {
           int flag=0;
           for (int j=2;j<=i/2;j++){
               if (i%j==0){
                   flag=1;
                   break ;
               }
           }
           if (flag==0 && i!=1){
               System.out.println(i);
           }
       }
   }*/
   /*public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           int Y=input.nextInt();
           int M=input.nextInt();
           int D=input.nextInt();
           int count;
           if (Y%4==0&&Y%100!=0){
               if (M-1>2){
                   count=30*(M-2)+28+D;
                   System.out.println("今天是"+Y+"年的第"+count+"天");
               }else{
                   count=30*(M-1)+D;
                   System.out.println("今天是"+Y+"年的第"+count+"天");
               }
           }
           else{
               if (M-1>2){
                   count=30*(M-2)+29+D;
                   System.out.println("今天是"+Y+"年的第"+count+"天");
               }else{
                   count=30*(M-1)+D;
                   System.out.println("今天是"+Y+"年的第"+count+"天");
               }
           }
       }
*/
    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
            switch (month) {
                case 1:
                    System.out.println(day);
                    break;
                case 2:
                    System.out.println(31 + day);
                    break;
                case 3:
                    System.out.println(59 + day);
                    break;
                case 4:
                    System.out.println(90 + day);
                    break;
                case 5:
                    System.out.println(120 + day);
                    break;
                case 6:
                    System.out.println(151 + day);
                    break;
                case 7:
                    System.out.println(181 + day);
                    break;
                case 8:
                    System.out.println(212 + day);
                    break;
                case 9:
                    System.out.println(243 + day);
                    break;
                case 10:
                    System.out.println(273 + day);
                    break;
                case 11:
                    System.out.println(303 + day);
                    break;
                case 12:
                    System.out.println(333 + day);
                    break;
            }
        }*/
    /*public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int x= input.nextInt();
            int y= input.nextInt();
            int t;
            while(x!=0){
                t=y%x;
                y=x;
                x=t;
            }
            System.out.println(y);
        }*/
    /*public static void main(String[] args) {
        double balance = 1000;
        System.out.println("请输入账号和密码：");
        Scanner input =new Scanner(System.in);
        int account = input.nextInt();
        int passward = input.nextInt();
        if (account ==666666 && passward ==111111){
            System.out.println("请输入要进行的操作：");
            System.out.println("1.存款");
            System.out.println("2.取款");
            System.out.println("3.查询余额");
            System.out.println("请输入要进行的操作：");
            int  choose = input.nextInt();
        switch (choose){
            case 1 :
                System.out.println("请输入要存入的金额");
                int deposit = input.nextInt();
                balance=balance+deposit;
                System.out.println("您当前的总余额为"+balance);
                break;
            case 2 :
                System.out.println("请输入要取出的金额");
                int draw = input.nextInt();
                balance=balance-draw;
                System.out.println("您当前的总余额为"+balance);
                break;
            case 3:
                System.out.println("您当前的余额为"+balance);
                break;
           }
        }
        else{
            System.out.println("密码或账号错误，请重新输入");
        }
    }*/
   /* public static void main(String[] args) {
       out: for (int i=2; i<=100; i++){
            for ( int j=2; j<i;j++){
               if(i%j==0) {
               continue out;
               }
            }
           System.out.println(i);
        }

    }*/
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            int flag=0;
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    flag=1;
                    break ;
                }
            }
            if (flag==0&&i!=1){
                System.out.println(i);
            }
        }
    }
}








