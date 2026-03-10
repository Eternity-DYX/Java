package com.DYX.loopfor;

public class ForDemo5 {
    public static void main(String[] args) {
        /*
            需求：打印1-100之间的偶数和
        */

        //1、利用循环获取1-100之间的每一个数据
        /*int sum = 0;
        for(int i = 1; i <= 100; i++)
        {
            //2、判断当前数据是否是偶数
            if(i % 2 == 0)
            {
                //3、如果是偶数，就累加
                sum += i;
            }
        }
        System.out.println(sum);*/

        int sum = 0;
        for(int i = 2; i <= 100; i+=2)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
