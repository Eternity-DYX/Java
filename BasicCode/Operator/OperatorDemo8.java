package com.DYX.operator;

import java.util.Scanner;

public class OperatorDemo8 {
    public static void main(String[] args) {
        /*
            练习1：键盘录入你和你好朋友的身高，比一比谁更高？

            练习2：键盘录入一个3位数，判断是否能被3整除
        */


        //练习1：键盘录入你和你好朋友的身高，比一比谁更高？

        //1.键盘录入两个小数，分别表示我和我的好朋友的身高
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我的身高：");
        double myHeight = sc.nextDouble();
        System.out.println("请输入我的好朋友的身高：");
        double friendHeight = sc.nextDouble();

        //2.比较
        Boolean result = myHeight >= friendHeight;
        System.out.println(result);
    }
}
