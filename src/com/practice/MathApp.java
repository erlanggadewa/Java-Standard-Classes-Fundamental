package com.practice;

/*
    * Math Class
        - Class Math merupakan class utilities yang berisikan banyak sekali static method untuk operasi
            numerik, seperti trigonometric, logarithm, akar pangkat, dan lain-lain
 */
public class MathApp {
    public static void main(String[] args) {
        var min = Math.min(5, 10);
        System.out.println(min);

        var max = Math.max(5, 10);
        System.out.println(max);

        var abs = Math.abs(-5);
        System.out.println(abs);
    }
}
