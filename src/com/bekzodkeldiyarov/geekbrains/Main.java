package com.bekzodkeldiyarov.geekbrains;

public class Main {

    public static void main(String[] args) {
        System.out.println(isSumInLimit(10, 0));
        checkNumber(-12);
        System.out.println(isNegative(12));
        repeatNTime("Geekbrains Java Course", 6);
        System.out.println(isLeap(2100));
    }

    public static boolean isSumInLimit(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    public static void repeatNTime(String string, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
