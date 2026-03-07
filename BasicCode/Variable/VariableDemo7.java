package com.DYX.variable;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {
        /*
               定义两个整数类型的的变量num1和num2，键盘录入数据分别为两个变量赋值
               求两个数的和并打印

        */
        //1.找到Scanner这个打工人
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");

        //2.让Scanner干活
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        //3.求和
        int result = num1 + num2;
        System.out.println("两个数字的和为：" + result);

    }
}
