package com.DYX.loopdowhile;

public class DoWhileDemo1 {
    public static void main(String[] args) {
        /*
        利用do...while循环，输出5行"hello world"

        for,while的特点，先判断后执行
        do...while的特点，先执行后判断
        */


            int i = 10;
            do
            {
                System.out.println("hello world");
                i++;
            }while(i <= 5);

            for (int j = 1; j <= 5; j++)
            {
                System.out.println("hello world");
            }
    }
}
