package com.DYX.variable;

import java.util.Scanner;

public class VariableDemo8 {
    public static void main(String[] args) {
        //BMI = 体重/身高*身高;

        //1.键盘录入体重 KG 65
        System.out.println("请输入体重：");
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();

        //2.键盘录入身高 M 1.80
        System.out.println("请输入身高：");
        double height = sc.nextDouble();

        //3.计算BMI
        double BMI = weight/(height*height);
        System.out.println(BMI);
    }
}
