package com.DYX.controllerloop;

import java.util.Scanner;

public class BreakDemo2 {
    static void main(String[] args) {
        /*
            初始最大生命200，受到x点伤害，技能回复y点血量，x和y由键盘登入而来
            假设，游戏人物不会死亡，最少是1点血
            问：最终游戏人物血量是多少？

            要考虑的情况，键盘录入必须大于0，否则需要重新输入
        */
        //1.定义变量记录人物的生命值
        int hp = 200;

        //2.键盘录入技能的伤害值
        System.out.println("请输入技能的伤害值：");
        Scanner sc = new Scanner(System.in);
        //循环 + break
        //一直录入数据，直到数据符合要求
        int damage = 0;
        while(true)
        {
            damage = sc.nextInt();
            //判断是否符合当前要求
            if(damage > 0)
            {
                break;
            }
            else
            {
                System.out.println("输入的伤害值有误，请重新输入：");
            }
        }

        //3.计算当前生命值
        hp = hp - damage;

        //4.判断当前生命值是否小于0
        if(hp <= 0)
        {
            hp = 1;
        }

        System.out.println("最终游戏人物的血量是：" + hp);

        //4.键盘录入技能的回复值
        System.out.println("请输入技能的回复值：");
        int recovery = 0;
        while(true)
        {
            recovery = sc.nextInt();
            if(recovery > 0)
            {
                break;
            }
            else
            {
                System.out.println("输入的回复值有误，请重新输入：");
            }
        }

        //5.计算当前生命值
        hp = hp + recovery;

        if (hp > 200)
        {
            hp = 200;
        }
        System.out.println("最终游戏人物的血量是：" + hp);
    }
}
