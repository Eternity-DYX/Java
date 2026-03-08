package com.DYX.IfDemo;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
        /*
            需求：小明在每次订外卖都会在多家平台对比，看谁的优惠力度更大
            已知：
                饱了么App：全场9折优惠
                美单App：满30减10元
            请问1:
                小明买了一吨烧烤50元，在哪家下单更划算
            请问2:
                如果价格不确定，数据由键盘录入而来呢?
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入价格：");
        int price = sc.nextInt();

        //1.计算两个APP的优惠价格
        double blmPrice = price * 0.9;
        int meiPrice = price >= 30 ? price - 10 : price;

        //2.判断哪个价格更划算
        if (blmPrice < meiPrice)
        {
            System.out.println("在饱了么买更划算");
        }
        else
        {
            System.out.println("在美单买更划算");
        }
    }
}
