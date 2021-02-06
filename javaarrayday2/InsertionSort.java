package javaarrayday2;

import java.util.Arrays;

public class InsertionSort {
    //基本思想：在要排序的
    /*public static void main(String[] args) {
        int  [] a= new int[]{2,5,6,3};
        for (int i = 0; i < a.length; i++) {
            int current =a [i];
            for (int j = i-1; j >=0; j--) {
                if (current<a[j]){
                    a[j+1] = a[j];
                    a[j] = current;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }*/
    //改进
    public static void main(String[] args) {
        int [] a = {8,9,7,6,5,4,3,2,1,0};
        for (int i = 0; i < a.length-1; i++) {
            int current = a[i+1];
            int p=i;//需要排序的前面有几个数字
            while(p>=0&&a[p]>current){
                a[p+1]=a[p];
                p--;
            }
            a[p+1]=current;

        }
        System.out.println(Arrays.toString(a));
    }

}

