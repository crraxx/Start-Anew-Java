/*
package 包 com.ff.javaoop.day3;路径名，java中不同层级之间用.隔开，在一般的文件目录中用"/"隔开
包就是文件夹
作用 1.避免类重名
2.按照不同的功能管理类
3.控制访问权限
*/
package com.ff.javaoop.day3;
/*
import 类的地址，在一个类中使用另一个包中的类需要用import关键字将类的地址导入
java.lang 包中的类在使用时候不需要导入,如String s = "jds";的使用
不允许导入两个类名相同的类，在实际中如果必须要导入则需要将其中一个用全类名表示
 */
import java.util.Date;

/*
类名平常用的都是简写，全类名 = 包名+类名的简称
 */
public class Demo {
    public static void main(String[] args) {
        Date date = new Date();
        String s = "jds";
        java.sql.Date date1 = new java.sql.Date(2);
    }
}


