package javaarrayday2;

import java.util.Arrays;
import java.util.Scanner;

public class JudgeAge {
    //任意一个人输入年龄，就可以判断出他是哪个年龄段的人？
    //0-9   儿童
    //10-19 少年
    //20-29 青少年
    //30-39 青年
    //40-49 壮年
    //50-59 中年
    //60-69 中老年
    //70-79 老年
    //80-89 老老年
    //90-99 老老老年
    //使用数组实现完成
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int s=age/10;
        String [] a = {"儿童","少年","青少年","青年","壮年","中年","中老年","老年","老老年","老老老年"};
            System.out.println("他是"+a[s]+"阶段的人");
    }
}
