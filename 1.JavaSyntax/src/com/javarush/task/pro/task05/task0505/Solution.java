package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = console.nextInt();
        if (number > 0) {
            int[] arrayNumbers = new int[number];
            for (int i = 0; i < arrayNumbers.length; i++) {
                System.out.println("Введите еще одно число ");
                arrayNumbers[i] = console.nextInt();
            }
            if ((number % 2) == 0) {
                for (int i = number - 1; i >= 0; i--) {
                    System.out.println(arrayNumbers[i]);
                }
            } else {
                    for (int i = 0; i < arrayNumbers.length; i++) {
                        System.out.println(arrayNumbers[i]);
                }
            }
        }
    }
}

