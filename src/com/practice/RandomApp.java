package com.practice;

import java.util.Random;

/*
    * Random Class
        - Random class adalah class yang berisikan method untuk menge-generate angka random
 */

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int intRandom = random.nextInt(1000);
            System.out.println(intRandom);

            System.out.println(random.nextGaussian());
        }
    }
}
