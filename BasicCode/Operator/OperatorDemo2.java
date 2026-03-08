package com.DYX.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    static void main(String[] args) {
        /*
            需求：键盘录入一个三位数，将其拆分为个位、十位、百位，并打印出来
        */

        System.out.println("请输入一个三位数：");
        Scanner sc = new Scanner(System.in);

        //1.键盘录入一个三位数
        int number = sc.nextInt();

        //2.拆分

        //个位
        int ge = number % 10;

        //十位
        int shi=number / 10 % 10;

        //百位
        int bai = number / 100;

        System.out.println("百位：" + bai);
        System.out.println("十位：" + shi);
        System.out.println("个位：" + ge);

    }
}
