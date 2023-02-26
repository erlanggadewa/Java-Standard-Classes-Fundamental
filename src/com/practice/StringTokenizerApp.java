package com.practice;

/*
    * StringTokenizer Class
        - String Tokenizer class adalah class yang bisa digunakan untuk memotong String menjadi token
            atau string yang lebih kecil
        - Kita bisa memotong String dengan delimiter yang kita mau
        - Lebih hemat memori daripada split dikarenakan StringTokenizer berjalan lazy
            artinya dia tidak akan memotong String jika kita tidak memanggil method nextToken()
 */

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("Erlangga Dewa Sakti", " ");
        System.out.println(tokenizer.countTokens());

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
