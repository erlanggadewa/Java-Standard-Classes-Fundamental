package com.practice;

/*
    * Arrays Class
       - Arrays class adalah class yang berisikan static method yang bisa kita gunakan untuk memanipulasi
            data array, seperti pencarian dan pengurutan
 */

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] randomNumbers = {3, 1, 2, 6, 4, 5, 0, 9, 7, 8, 0};

        Arrays.sort(randomNumbers);
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println(Arrays.binarySearch(randomNumbers, 5));
        System.out.println(Arrays.binarySearch(randomNumbers, 999)); // Jika tidak ditemukan akan menghasilkan nilai negatif

        int[] ints = Arrays.copyOf(randomNumbers, 5);// Mengcopy array dari index 0 sampai index 4
        System.out.println(Arrays.toString(ints));
    }
}
