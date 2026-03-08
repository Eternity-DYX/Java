package com.DYX.operator;

public class OperatorDemo14 {
    static void main(String[] args) {
       //利用三元运算符，求两个整数的最大值


        //1.定义两个整数
        int a = 10;
        int b = 20;

        //2.利用三元运算符求最大值
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
