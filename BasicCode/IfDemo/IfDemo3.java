package com.DYX.IfDemo;

public class IfDemo3 {
    public static void main(String[] args) {
        /*
            需求：定义一个修奥数表示考试成绩
            判断学生的考试成绩，如果大于等于60分输出通过，否则不通过

        */

        //1.定义一个变量表示考试成绩
        int score = 59;

        //2.判断成绩

        //先对成绩判断是否合理
        if(score >= 0 && score <= 100)
        {
            if(score >= 60)
            {
                System.out.println("通过");
            }
            else
            {
                System.out.println("未通过");
            }
        }
        else
        {
            System.out.println("成绩不合理");
        }

    }
}
