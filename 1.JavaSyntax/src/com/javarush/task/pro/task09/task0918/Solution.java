package com.javarush.task.pro.task09.task0918;

/* 
Поработаем со StringBuilder
*/

public class Solution {

    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder a = new StringBuilder(string);
        for (int i = 0; i < strings.length ; i++) {
            a.append(strings[i]);
        }
        return a;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder b = new StringBuilder(string);
        return b.replace(start,end, str);
    }
}
