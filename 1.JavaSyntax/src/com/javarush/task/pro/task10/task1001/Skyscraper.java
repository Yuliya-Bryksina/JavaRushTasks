package com.javarush.task.pro.task10.task1001;

/* 
Создадим небоскреб
*/

public class Skyscraper {

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();


    }

    public Skyscraper() {
        this.title = UNKNOWN;
        System.out.println(UNKNOWN);
    }

    public static String UNKNOWN = "Небоскреб построен.";
    String title;
}



