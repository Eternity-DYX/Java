package com.DYX.array;

public class Test2 {
    static void main(String[] args) {
        /*
        查找数据
        已知数组元素为[33,5,22,44,55,33]
        请找出最大值并打印

        细节1：
                循环的开始条件，如果为0，那么对结果是否有影响
                对结果没有影响，只不过循环多执行一次

        细节2：
                max的初始化能否赋值为0？
                不能赋值为0
                max记录的值一定要是数组里面的元素
         */

        //1.创建数组
        int [] arr = {33,5,22,44,55,33};

        //2.定义一个变量，默认记录第一个值
        int max = arr[0];

        //3.让后面的数据依次比较
        for (int i = 1; i < arr.length; i++)
        {
            //判断
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
