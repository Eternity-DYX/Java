package com.DYX.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入时间（秒数）：");
        int time = sc.nextInt();

        //1.计算小时数
        int hour = time / 3600;

        //2.计算分钟数
        int minute = (time-(hour*3600))/60;//也可以用 time % 3600 / 60

        //3.计算秒数
        int second = time - (hour*3600) - (minute*60);//也可以用 time % 3660 % 60
        System.out.println(hour+"时"+minute+"分"+second+"秒");
    }
}
