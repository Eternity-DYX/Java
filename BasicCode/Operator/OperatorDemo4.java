package com.DYX.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {
        //练习一：
        byte a = 10;
        short b = 20;
        double c = 30.5;

        //请说出下面代码在计算的时候，类型转换的情况
        /*
            1.a + b
            先把byte类型的a和short类型的20转换成int类型
            结果：30（int）

            2.30（int）+ c
            把int类型的30转换成double类型,变成30.0
            结果：60.5（double）
        */
        double result1 = a + b + c;
        System.out.println(result1);//60.5
    }
}
