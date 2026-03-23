package com.DYX.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class Test {
    static void main(String[] args) {
        /*
                随机生成一个1~100之间的随机数，利用键盘录入模拟猜的动作，一直猜，直到猜中为止
        */


        //1.找到random这个类
        Random r = new Random();

        //2.生成一个随机数
        //第一种写法 int n = r.nextInt();  默认在int范围内生成一个随机数
        //第二种写法 小括号写一个数字n 表示在0~n-1之间生成一个随机数
        //第三种写法 小括号写两个数字a b 表示在a~b之间生成一个随机数 包含a 不包含b

        int n = r.nextInt(0,101);

        while (true)
        {
            //2，键盘录入模拟猜的动作

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜测的数字：");
            int guessNumber = sc.nextInt();


            //3.判断
            if (guessNumber > n)
            {
                System.out.println("你猜的数字太大了");
            }
            else if (guessNumber < n)
            {
                System.out.println("你猜的数字太小了");
            }
            else
            {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}
