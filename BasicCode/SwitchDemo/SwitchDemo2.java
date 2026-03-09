package com.DYX.switchDemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /*
            1.default的位置和省略
            位置:case和default是没有标准的上下之分，位置可以任意的书写
                 为了观看方便，提升代码的阅读性
                 一般来讲，case从小到大书写，default是写在最下面的
            省略：default可以省略，在此时如果所有的case都不匹配，则没有任何的输出结果
        */

        int week = 0;
        switch (week)
        {
            case 1:
                System.out.println("星期一");
                break;

            case 3:
                System.out.println("星期三");
                break;

            case 2:
                System.out.println("星期二");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;

            default:
                System.out.println("没有这个星期");
            case 6:
                System.out.println("星期六");
                break;

            case 7:
                System.out.println("星期日");
                break;


        }

    }
}
