package com.DYX.switchDemo;

import java.util.Scanner;

public class SwitchDemo1 {
    static void main(String[] args) {
        /*
            需求：键盘录入星期数，显示今天的运动
            1.周一：跑步
            2.周二：游泳
            3.周三：看电影
            4.周四：爬山
            5.周五：踢足球
            6.周六：拳击
            7.周日：休息
        */

        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();

        //2.利用Switch语句判断
        switch (week)
        {
            case 1:
                System.out.println("跑步");
                break;

            case 2:
                System.out.println("游泳");
                break;

            case 3:
                System.out.println("看电影");
                break;

            case 4:
                System.out.println("爬山");
                break;

            case 5:
                System.out.println("踢足球");
                break;

            case 6:
                System.out.println("拳击");
                break;

            case 7:
                System.out.println("休息");
                break;

            default:
                System.out.println("输入的星期数有误");
        }
    }
}
