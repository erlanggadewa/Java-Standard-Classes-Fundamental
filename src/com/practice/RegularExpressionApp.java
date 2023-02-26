package com.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    * Regular Expression
        - Regular Expression atau disingkat regex adalah cara untuk melakukan pola pencarian
        - Biasanya dilakukan untuk pencarian dalam data String
        - Secara sederhana, kita mungkin sudah sering melakukan pencarian text, entah di text editor atau
            di aplilkasi word
        - Regex adalah pencarian yang lebih advanced dibanding pencarian text biasanya, misal kita ingin
            mencari semua kata yang mengandung diawali huruf a dan diakhiri huruf a, dan lain-lain

    * Regex Package
        - Java sudah menyediakan package java.util.regex yang berisikan utilitas untuk melakukan proses
            regular expression
        - Secara garis besar terdapat 2 class yang dapat kita gunakan, yaitu Pattern class dan Matcher class
        - Pattern class adalah representasi hasil kompilasi dari pola regular expression yang kita buat
        - Matcher class adalah engine untuk melakukan pencarian dari pattern yang sudah kita buat
        - Aturan regular expression itu sangat kaya dan kompleks, sehingga kita tidak akan membahasnya
            secara detail

 */

public class RegularExpressionApp {
    public static void main(String[] args) {
        String text = "Helo nama saya Erlangga Dewa Sakti, saya merupakan seorang programmer yang tampan dan berintelek";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[aA][a-zA-Z]*");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find())
            System.out.println(matcher.group());
    }
}
