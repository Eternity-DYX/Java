package com.DYX.variable;

public class VariableDemo5 {
    static void main(String[] args) {


        //BMI = 体重/身高*身高

        //1.定义变量记录我的体重 65KG
        float weight=65;

        //2.定义变量记录我的身高 1.8M
        float hight=1.8f;

        //3.定义变量记录BMI
        double BMI=weight/(hight*hight);
        System.out.println(BMI);


    }
}
