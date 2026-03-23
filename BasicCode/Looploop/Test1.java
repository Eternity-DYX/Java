package com.DYX.looploop;

public class Test1 {
    static void main(String[] args){
        /*
            打印4行5列的*
            *****
            *****
            *****
            *****

            限定：每次只能输出一个*
        */

        //*****
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
