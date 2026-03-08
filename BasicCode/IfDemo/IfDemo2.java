package com.DYX.IfDemo;

import java.util.Scanner;

public class IfDemo2 {
    static void main(String[] args) {
        /*
            需求：初始生命200，受到x点伤害，技能回复y点血量，x和y由键盘登入而来
            假设，游戏人物不会死亡，最少一点血
            问：最终游戏人物须血量是多少？
        */

        //1.定义变量记录人物的生命值
        int hp = 200;

        //2.键盘录入技能的伤害值
        System.out.println("请输入技能的伤害值：");
        Scanner sc = new Scanner(System.in);
        int damage = sc.nextInt();//判断技能伤害值是否小于0，负数，重负输入

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
        int recovery = sc.nextInt();

        //5.计算当前生命值
        hp = hp + recovery;

        if (hp > 200)
        {
            hp = 200;
        }
        System.out.println("最终游戏人物的血量是：" + hp);
    }
}
