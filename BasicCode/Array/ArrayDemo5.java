package com.DYX.array;

public class ArrayDemo5 {
    static void main(String[] args) {
        /*
                索引越界

                针对任意一个数组而言，索引的范围都是[0,数组长度-1]
         */

        //1.定义一个数组
        int []arr={10,20,30,40,50};
        System.out.println(arr[10]);
    }
}
