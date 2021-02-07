package com.ff.javaoop.day1;

import java.util.Scanner;

public class ToolTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        Tool tool = new Tool();

        tool.JudgeNum(i);

        String name = input.next();
        int age = input.nextInt();
        tool.BuyTicket(name,age);

    }
}