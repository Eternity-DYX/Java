package com.DYX.operator;

import java.util.Scanner;

public class OperatorDemo13 {
    static void main(String[] args) {

        //寻找7的有缘数，定义一个两位整数，只要该数字是包含7或者是7的倍数，就是7的有缘数

        //1.键盘录入一个两位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个两位数：");
        int number = sc.nextInt();


        //包含7：个位是7或者十位是7
        //7的倍数：number % 7 == 0

        //2.获取个位和十位

        int ge = number % 10;
        int shi = number / 10;

        //3.判断当前数字是否是7的倍数
        //ge == 7 || shi == 7 || number % 7 == 0
        boolean result = ge == 7 || shi == 7 || number % 7 == 0;
        System.out.println(result);

    }
}
