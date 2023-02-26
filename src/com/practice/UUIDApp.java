package com.practice;

import java.util.UUID;

/*
    * UUID Class
        - Saat membuat aplikasi, kadang l<ita ada kasus ingin membuat data unique, misal untuk kebutuhan
            data primary key misalnya
        - Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier.
        - UUID adalah format standard untuk membuat unique value yang telah terjamin
 */

public class UUIDApp {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid);
        }
    }
}
