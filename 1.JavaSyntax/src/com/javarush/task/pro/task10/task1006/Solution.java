package com.javarush.task.pro.task10.task1006;

/* 
Кто тут наследник?
*/

public class Solution {
    public static void main(String[] args) {
        HybridCar hybridCar = new HybridCar();
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
    }

    public static class Car {

        public Car(String value) {
            System.out.println(value);
        }
    }

    public static class ElectricCar extends Car {
        public ElectricCar() {
            super("Привет. Я ElectricCar");
        }
    }

    public static class GasCar extends Car {
        public GasCar() {
            super("Привет. Я GasCar");
        }
    }

    public static class HybridCar extends Car {
        public HybridCar() {
            super("Привет. Я HybridCar");
        }
    }
}
