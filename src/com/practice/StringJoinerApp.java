package com.practice;

/*
    * StringJoiner Class
        - StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan delimiter
        - StringJoiner juga mendukung prefix dan suffix jika kita ingin menambahkannya
        - Ini sangat bagus ketika ada kasus misal kita ingin mem-print Array dengan format yang kita mau
 */

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        joiner.add("Erlangga");
        joiner.add("Dewa");
        joiner.add("Sakti");

        System.out.println(joiner);
    }
}
