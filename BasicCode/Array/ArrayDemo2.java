package com.DYX.array;

public class ArrayDemo2 {
    static void main(String[] args) {
        /*
                数组中元素访问：
                1.获取数据
                2.修改数据
        */

        //1.利用静态初始化创建数组
        int []arr={10,20,30,40,50};

        //2.获取数组中的元素
        //索引:从0开始，连续+1，中间不间断
        int num = arr[0];
        System.out.println(num);
        System.out.println(arr[0]);

        //获取1索引的数据
        System.out.println(arr[1]);

        //修改数据
        //arr[索引] = 新数据
        //注意：一旦修改完毕，原来的数据就被覆盖了
        arr[0] = 100;
        System.out.println(arr[0]);//100 20 30 40 50

    }
}
