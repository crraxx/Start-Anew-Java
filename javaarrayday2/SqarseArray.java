package javaarrayday2;

public class SqarseArray {
    public static void main(String[] args) {
        //将二维数组转化为稀疏数组
        //1.创建一个二维数组，其中有三个非零元素
        int a[][] = new int[15][15];
        a[2][0] = 1;
        a[3][5] = 5;
        a[4][2] = 3;
        int sum = 0;
        /*//原始的二维数组为：
        System.out.println("原始的二维数组为：");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");*/

        //2.遍历二维数组，记录非零元素的个数sum，从而确定稀疏数组的行数为sum+1
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    sum++;
                }
            }
        }

        //3.创建稀疏数组，确定数组中元素的值
        int sqarse[][] = new int[sum + 1][3];
        sqarse[0][0] = a.length;
        sqarse[0][1] = a.length;
        sqarse[0][2] = sum;
        int index = 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != 0) {
                    sqarse[index][0] = i;
                    sqarse[index][1] = j;
                    sqarse[index][2] = a[i][j];
                    index++;
                }
            }
        }
        //打印输出稀疏数组
        System.out.println("二维数组转化后的稀疏数组为：");
        for (int i = 0; i < sqarse.length; i++) {
            for (int j = 0; j < sqarse[i].length; j++) {
                System.out.print(sqarse[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");

        //将稀疏数组转化为二维数组
        //新建一个二维数组并为其赋值
        int[][] b = new int[sqarse[0][0]][sqarse[0][1]];
        for (int i = 1; i < sqarse.length; i++) {
            b[sqarse[i][0]][sqarse[i][1]] = sqarse[i][2];
        }
        //打印输出二维数组
        System.out.println("稀疏数组转化后的二维数组为：");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
