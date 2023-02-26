package com.practice;

/*
    * Number Class
        - Semua number class yang bukan primitif memiliki parent class yang sama, yaitu class Number
        - Class number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain
        - Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lainnya

    * Konversi String ke Number
        - Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke number
        - parseXxx(string) digunakan untuk mengkonversi dari string ke tipe data number primitif
        - valueOf(string) digunakan untuk mengkonversi dari string ke tipe data number non primitif
        - Method ini akan throw NumberFormatException jika ternyata gagal melakukan konversi String ke number
 */

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        System.out.println(intValue);

        Double doubleValue = intValue.doubleValue();
        System.out.println(doubleValue);

        String stringNumber = "1000000";
        Integer intNumber1 = Integer.valueOf(stringNumber);
        int intNumber2 = Integer.parseInt(stringNumber);

    }
}
