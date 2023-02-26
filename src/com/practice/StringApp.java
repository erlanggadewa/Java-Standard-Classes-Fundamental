package com.practice;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringApp {
    public static void main(String[] args) {
        String name = "Erlangga Dewa Sakti";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(Arrays.toString(name.getBytes(StandardCharsets.UTF_8)));
        System.out.println(" ".isBlank());

        String[] names = name.split(" ");
        for (String s : names) {
            System.out.println(s);
        }

        System.out.println(name.substring(0, 7));
    }
}
