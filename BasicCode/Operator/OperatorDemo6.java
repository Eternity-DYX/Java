package com.DYX.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {
        //实现字母的大小写转换，将大写字母转化为小写字母
        //A ---> a


        //1.定义变量记录大写的字符
        char ch = 'A';

        //2.转成小写
        char cc = (char)(ch + 32);
        System.out.println(cc);
    }
}
