package com.DYX.looploop;

public class Test3 {
    static void main(String[] args) {
        /*
            打印平行四边形
            ##******
            #******#
            ******##
        */

        //外循环：控制图形的行数
        for (int i = 1; i <= 3; i++)
        {
            //内循环：控制图形的列数
            for (int j = i; j <= 2; j++)
            {
                System.out.print(" ");
            }
            
            //输出*
            for (int j = 0; j < 6; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
