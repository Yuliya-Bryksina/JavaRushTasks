package com.javarush.task.pro.task12.task1203;

/* 
Сравнение чисел
*/

public class Solution {
    static Integer first = 100;
    static Integer second = 100;
    static int third = 100;

    public static void main(String[] args) {
        System.out.println(first == second);
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
