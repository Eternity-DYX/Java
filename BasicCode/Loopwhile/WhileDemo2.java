package com.DYX.loopwhile;

public class WhileDemo2 {
    static void main(String[] args) {
        /*
            假设你在英航投资了100000，银行给出的复利是1.7%，问多少年后能实现本金翻倍？
            请问：用什么循环？
            for：范围 次数
            while：结束条件
        */
        //1.定义变量记录本金
        double money = 100000;

        //2.定义变量记录期望本金
        double expectMoney = 200000;

        //3.定义变量记录年数
        int year = 0;

        //4.利用循环找到满足条件的年数
        //while：条件判断语句
        while (money < expectMoney)
        {
            //4.计算复利
            money =money + money * 0.017;
            //5.自增
            year++;
        }
        System.out.println("需要"+year+"年后，本金翻倍");
    }
}
