package com.DYX.switchDemo;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args) {
        /*
            case穿透
            case穿透：当case后面的条件为true的时候，会继续向下执行，直到遇到break或者运行完整个程序
            应用场景：
                    当多个case条件满足的时候，利用case穿透，可以节省代码
        */

        //1.定义变量记录星期几
        int week = 3;
        switch (week)
        {
            case 1:
                System.out.println("星期一");
            case 2:
                System.out.println("星期二");
            case 3:
                System.out.println("星期三");
            default:
                System.out.println("没有这个星期");
            case 4:
                System.out.println("星期四");
            case 5:
                System.out.println("星期五");
            case 6:
                System.out.println("星期六");
            case 7:
                System.out.println("星期日");
        }


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = sc.nextInt();

        switch (month)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;

            default:
                System.out.println("没有这个月份");
        }
    }
}
