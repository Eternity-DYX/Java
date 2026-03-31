package com.DYX.array;

import java.util.Scanner;

public class Test1 {
    static void main(String[] args) {
        /*
        查找数据
        已知数组元素为[33,5,22,44,55,33]
        键盘录入一个数据，查找这个数据在数组中是否存在
        如果数组中要查找的数据出现多次，只要显示第一次的索引即可
        输出要求：
        如果存在打印索引
        如果不存在，提示：“该数据不存在”
         */

        //1.定义数组
        int [] arr = {33,5,22,44,55,33};

        //2.键盘录入任意一个数据
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        //作用：记录数组当中是否存在number
        boolean flag = false;

        //3.遍历数组，获取数组中的元素
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == num)
            {
                System.out.println(i+1);
                flag = true;
                break;
            }

        }
        //判断flag
        if (!flag)
        {
            System.out.println("该数据不存在");
        }
    }
}
