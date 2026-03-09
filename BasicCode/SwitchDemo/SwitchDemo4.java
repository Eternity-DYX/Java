package com.DYX.switchDemo;

public class SwitchDemo4 {
    public static void main(String[] args) {
        /*
            switch新特性
            1.箭头标签
            2.case后面可以跟多个值
            3.switch可以有运行结果
            4.yield关键字
        */

        /*int number = 3;
        switch (number)
        {
            case 1,2,3 ->
            {
                System.out.println("数字在1-10之间");
            }
            case 4,5,6 ->
            {
                System.out.println("数字在4-6之间");
            }
            case 7,8,9,10 ->
            {
                System.out.println("数字在7-10之间");
            }
            default ->
            {
                System.out.println("数字不在1-10之间");
            }
        }*/


        /*int number = 3;
         String result = switch (number)
        {
            case 1,2,3 -> {
                yield "数字在1-10之间";
            }
            case 4,5,6 -> {
                yield "数字在4-6之间";
            }
            case 7,8,9,10 -> {
                yield "数字在7-10之间";
            }
            default -> {
                yield "数字不在1-10之间";
            }
        };
         //如果下面，我要继续使用switch的结果
        System.out.println(result);*/

        //练习：
        //      利用switch模拟计算器 + - * /
        int a = 10;
        int b = 20;
        String operator = "+";
        int result = switch (operator)
        {
            case "+" ->
            {
                yield a + b;
            }
            case "-" ->
            {
                yield a - b;
            }
            case "*" ->
            {
                yield a * b;
            }
            case "/" ->
            {
                yield a / b;
            }
            default ->
            {
                yield 0;
            }
        };
        System.out.println(result);
    }
}
