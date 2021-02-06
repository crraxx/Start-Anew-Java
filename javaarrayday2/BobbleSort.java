package javaarrayday2;

import java.util.Arrays;

public class BobbleSort {
    public static void main(String[] args) {
        //冒泡排序，相邻的两个元素进行比较
        //从小到大排：如a[j]>a[j+1],交换顺序;从大到小排：如a[j]<a[j+1],交换顺序.
        //比较次数：外循环比较a.length-1次，内循环比较a.length-i-1次。
        //时间复杂度：
        //稳定
        int [] a= {8,9,3,2,1};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
