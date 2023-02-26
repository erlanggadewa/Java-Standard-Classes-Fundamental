package com.practice;

import java.util.Base64;

/*
    * Base64 Class
        - Sejak Java 8, Java sudah menyediakan class untuk melakukan encoding base64
        - Buat programmer web pasti tahu tentang base64, yaitu encoding yang bisa digunakan untuk
            mengubah binary data ke text yang aman
        - Aman disini bukan dari Sisi security, tapi aman dari kesalahan parsing
 */
public class Base64App {
    public static void main(String[] args) {
        String name = "Erlangga Dewa Sakti";

        String encodedString = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(encodedString);

        byte[] bytes = Base64.getDecoder().decode(encodedString);
        String result = new String(bytes);
        System.out.println(result);
    }
}
