package com.xbc.school;

public class EasyMath {

    public static int add(int ... values) {
         int sum = 0;
         for (int v : values) {
             sum += v;
         }
         return sum;
    }

    public static int substract(int v1, int v2) {
        return v1 - v2 ;
    }

    public static int multiplication (int ... values){
        int result =1;
        for (int v : values) {
            result *= v;
        }
        return result;
    }

}
