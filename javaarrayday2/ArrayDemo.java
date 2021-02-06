package javaarrayday2;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //二维数组的声明
        int [][]a ;
        int a1[][];
        //二维数组的创建
        int [][] b = new int[4][5];
        int [][] c = new int[][]{{1,2,3},{1,2,3,4},{4,5,6,7}};
        int [][] d = {{4,5,6},{7,8,9}};
        int [][] e = new int[3][];
        System.out.println(e[0]);
        e[0]=new int[1];
        e[0][0]=5;
        System.out.println(e[0][0]);
       //二维数组的遍历
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
