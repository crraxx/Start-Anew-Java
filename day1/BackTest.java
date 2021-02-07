package com.ff.javaoop.day1;

import java.util.Scanner;

public class BackTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        while(true) {
            System.out.println("请选择要进行的操作");
            System.out.println("1.创建账户   2.存款  3.取款  4.查询");
            int N = input.nextInt();
            if (N > 0 && N < 5) {
                switch (N) {
                    case 1:
                        System.out.println("请输入账号");
                        String account = input.next();
                        System.out.println("请输入密码：");
                        String password = input.next();
                        System.out.println("请输入银行名称：");
                        String bankName = input.next();
                        bank.creatAccount(account, password, bankName);
                        System.out.println("您账户中的总余额为：" + bank.sum);
                        System.out.println();
                        System.out.println();
                        continue;
                    case 2:
                        System.out.println("请输入要存款的金额");
                        int s1 = input.nextInt();
                        bank.deposit(s1);
                        System.out.println("您账户中的总余额为：" + bank.sum);
                        System.out.println();
                        System.out.println();
                        continue;
                    case 3:
                        System.out.println("请输入要取款的金额");
                        int s2 = input.nextInt();
                        bank.withdrawal(s2);
                        System.out.println("您账户中的总余额为：" + bank.sum);
                        continue;
                    case 4:
                        bank.demand();
                        continue;
                }
            }
            else{
                System.out.println("非法输入");
            }
        }

    }
}
