package com.DYX.array;

public class Test3 {
    static void main(String[] args) {
        /*
        给定一个递增有序数组，去除其中重复元素
        int [] arr={1,1,2,2,2,2,3,3,3,3}
         */

        int [] arr={1,1,2,2,2,2,3,3,3,3};
        //1.定义两个指针（非C语言中的指针）
        int slow=0;
        int fast=1;

        //2.利用循环不断移动快慢指针，找出重复的元素
        while (fast < arr.length)
        {
            //判断两个指针指向的数据是否相同
            if(arr[slow]!=arr[fast])//不等
            {
                slow++;
                arr[slow]=arr[fast];
            }
            fast++;
        }
        //输出结果
        for (int i = 0; i <= slow; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
