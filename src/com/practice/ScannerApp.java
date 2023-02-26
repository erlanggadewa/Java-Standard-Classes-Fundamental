package com.practice;

/*
    * Scanner Class
        - Scanner sebenarnya bagian dari Java IO (Input Output)
        - Class Scanner hadir sejak Java 5
        - Class Scanner adalah class yang bisa digunakan untuk membaca input, entah dari file, console, dan lain-Iain
        - Class Scanner ini cocok untuk dijadikan object untuk membaca input user saat kita belajar
            membuat program Java menggunakan console / terminal
 */

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = userInput.nextLine();

        System.out.print("Umur : ");
        int age = userInput.nextInt();

        System.out.println("Halo " + name + ", umur kamu adalah " + age + " tahun");
    }
}
