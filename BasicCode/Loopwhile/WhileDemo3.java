package com.DYX.loopwhile;

public class WhileDemo3 {
    static void main(String[] args) {
        /*
           需求：世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，
           假如我有一张足够大的纸，它的厚度是0.1毫米
           请问：该纸张折叠多少次，可以折叠出世界最高山峰珠穆朗玛峰
           分析：
                1.纸张折叠：papaer = papaer * 2
                2.while条件：papaer < 8848860
        */
        //1.定义变量表示纸张高度
        double paper = 0.1;

        //2.定义变量记录折叠的次数
        int count = 0;

        //3.定义变量表示山的高度
        double height = 8848860;

        //4.利用循环折叠纸张
        while (paper < height)
        {
            paper = paper * 2;
            count++;
        }

        //5.输出折叠的次数
        System.out.println("折叠的次数为：" + count);
    }
}
