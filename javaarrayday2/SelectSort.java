package javaarrayday2;

import java.util.Arrays;

public class SelectSort {
    //选择排序
    //这里以升序排序为例
    //第一趟比较从第一个元素开始,依次和后面的所有元素进行比较,每找到一个比他小的元素就交换一次位置,第一趟结束后最小的数被找出.
    // 第二趟用第二个元素与剩余元素比较,并按规则交换顺序.
    // 每一趟结束后总有一个元素已经排好序,所以内循环会从第i个元素开始比较
    public static void main(String[] args) {
        int [] a ={8,9,3,1,2};
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if(a[i]>a[j]){
                    int temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            //System.out.println(Arrays.toString(a));
        }
       System.out.println(Arrays.toString(a));
    }
    }
    /*public static void main(String[] args) {
        //选择排序的优化
        //这里以升序排序为例
        //设置一个变量记录当前次数中的最小值,不用每找到一个比他小的就交换顺序
        int [] a={9,6,8,9,2};
        for (int i = 0; i < a.length; i++) {
            int indexmin=i;
            for (int j = i; j <a.length ; j++) {
                if(a[indexmin]>a[j]){
                 indexmin=j;
                }
            }
            int temp =a[i];
            a[i]=a[indexmin];
            a[indexmin]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}*/
