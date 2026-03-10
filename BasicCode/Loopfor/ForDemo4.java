package com.DYX.loopfor;

public class ForDemo4 {
    public static void main(String[] args){
    //要求：求1~5的和

    //第一次循环：i=1，sum=1
    //第二次循环：i=2，sum=3
    //第三次循环：i=3，sum=6
    //第四次循环：i=4，sum=10
    //5次循环：i=5，sum=15
    int sum = 0;
    for(int i = 1; i <= 5; i++)
    {
        sum += i;
    }
    System.out.println(sum);
    }
}
