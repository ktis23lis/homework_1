package com.company;

import java.util.Scanner;

public class Main {
    //Задание 2
    public static void main(String[] args) {
        byte a = 1;
        short b = 4;
        int c = 8;
        long d = 10;
        float f = 23.22f;
        double g = 15.6;
        char h = 32;
        boolean notActive = true;
        System.out.println(calculate(23.2f, 2.4f, 150.6f, 2.5f));//вызов задания 3
        System.out.println(task10and20(5,7)); //вызов задания 4, можно было инициализировать в методе
        isPositiveOrNegative(); //вызов задание 5, можно было поступить с инициализацией по аннологии с заданием 4
        System.out.println(isNegative(0));//вызов задания 6
        greetings("Кристина");//вызов задания 7
        yearRes(2019);//вызов задания 8

    }
    //Задание 3
    public static float calculate(float a, float b, float c, float d) {
        return a*(b+(c/d));
        //можно сделать еще и другим способом x = a*(b+(c/d));
        // return x;
    }
    //Задание 4
       public static boolean task10and20 (int x1, int x2) {
        if (x1 + x2 > 10 && x1 + x2 < 20) {
            return true;
        }
        return false;
    }

    //Задание 5
    public static void isPositiveOrNegative(){
        int x = -2;
        if (x < 0){
            System.out.println("Число отрицательное");
        }else {
            System.out.println("Число положительное");
        }
    }
    //Задание 6
    public static boolean isNegative(int x){
        if (x >= 0){
            return true;
        }else {
            return false;
        }
    }
    //Задание 7
    public static void greetings(String name){
        System.out.println("Привет " + name);
    }
    //Задание 8
    public static void yearRes(int year){
        int a = year % 400;
        int b = year % 100;
        int c = year % 4;
        if ( a == 0) {
            System.out.println("Высокосный год");
        } else if (b == 0){
            System.out.println("Не высокосный год");
        } else if (c == 0){
            System.out.println("Высокосный год");
        }else {
            System.out.println("Не высокосный год");
        }


    }



}
