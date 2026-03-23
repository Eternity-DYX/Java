package com.DYX.looploop;

public class Test2 {
    static void main(String[] args) {
        /*
            打印正三角
            *
            **
            ***
            ****
            *****
            打印倒三角
            *****
            ****
            ***
            **
            *
        */

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //第一种写法
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 6-i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //第二种写法
        for(int i = 1; i <= 5; i++)
        {
            for(int j = i; j <= 5 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
