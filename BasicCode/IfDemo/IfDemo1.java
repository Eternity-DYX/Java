package com.DYX.IfDemo;

public class IfDemo1 {
    public static void main(String[] args) {
        /*
            定义一个变量表示人的体温，对体温进行判断是否大于等于38度，如果超过打印语音警告
        */

        //1.定义一个变量表示人的体温
        double bodyTemperature = 39;

        //2.判断是否大于等于38度
        if(bodyTemperature >= 38)
        {
            System.out.println("语音警告，当前温度已经超过了38度");
        }

    }
}
