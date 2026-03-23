package com.DYX.controllerloop;

import java.util.Scanner;

public class BreakDemo3 {
    static void main(String[] args) {
        /*
            键盘录入一个大于等于2的整数，判断是否为质数

            质数：只能被1和自身整除的数 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
            100： 1 100 2 50 3 25 4 20 5 10 6 8 7 4 3 2 1

            n:
                1~n:2个
                2~n-1：0个
            19：
                2~18：0个
        */
        //键盘录入一个大于2的整数
        Scanner sc = new Scanner(System.in);
        int number = 0;
        while (true)
        {
            System.out.println("请输入一个大于等于2的整数：");
            number = sc.nextInt();
            if (number >= 2)
            {
                break;
            }
            else
            {
                System.out.println("输入的数字不符合要求，请重新输入：");
            }
        }

        //2.判断是否为质数
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++)//优化
        {
            if (number % i == 0)
            {
                count++;
                break;
                //只要找到了一个因子，就可以跳出循环了，后面的数据都不需要判断了
            }
        }

        //判断count
        if (count == 0)
        {
            System.out.println(number + "是质数");
        }
        else
        {
            System.out.println(number + "不是质数");
        }
    }
}
