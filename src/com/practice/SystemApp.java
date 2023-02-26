package com.practice;


/*
    * System Class
        - Class System adalah class yang berisikan banyak utility static method di Java, contohnya
            sebelumnya kita sudah sering menggunakan method println milik field out di class System.
 */
public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.out.println(System.identityHashCode("HEHE"));
        System.out.println(System.getenv());
        System.out.println(System.getenv("USERDOMAIN"));

        System.gc();
        System.exit(69);

//        Will not be printed because of System.exit(69);
        System.out.println("This will not be printed");
    }
}
