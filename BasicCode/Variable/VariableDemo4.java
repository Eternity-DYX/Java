package com.DYX.variable;

public class VariableDemo4 {
    static void main(String[] args) {

        /*
                定义8种数据类型的变量

                整数类型：byte short int long
                浮点类型：float double
                布尔类型：boolean
                字符类型：char

                变量的定义格式：
                        数据类型 变量名 = 数据值;
        */

        //1.定义byte类型的变量
        byte b = 10;
        System.out.println(b);

        //2.定义short类型的变量
        short s = 20;
        System.out.println(s);

        //3.定义int类型的变量
        int i = 30;
        System.out.println(i);

        //4.定义long类型的变量
        //细节：long类型数据必须以L结尾，可以是大写也可以是小写
        //建议：一般是写成大写的
        long l = 100000000000000L;
        System.out.println(l);

        //5.定义float类型的变量
        //细节：float类型数据必须以f结尾，可以是大写也可以是小写
        //建议：一般是写成大写的
        float f = 50.0f;
        System.out.println(f);

        //6.定义double类型的变量
        double d = 60.0;
        System.out.println(d);

        //7.定义boolean类型的变量
        boolean bool = true;
        System.out.println(bool);

        //8.定义char类型的变量
        char c = '好';
        System.out.println(c);
    }
}
