package com.DYX.array;

import java.util.Scanner;

public class ArrayDemo4 {
    static void main(String[] args) {
        /*
                数组的动态初始化
                需求：键盘录入5个整数，存入数组当中，并进行遍历
        */
        //键盘录入5个整数

        //1.创建一个数组
        int[] arr=new int[5];

        //2.键盘录入
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("请输入一个整数:");
            int num = sc.nextInt();
            arr[i] = num;
        }

        //3.遍历数组
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
