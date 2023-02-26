package com.practice;

import java.io.IOException;

/*
    * Runtime Class
        - Ketika aplikasi Java kita berjalan, kita bisa melihat informasi environment tempat aplikasi Java berjalan
        - Informasi itu terdapat di class Runtime.
        - Class Runtime tidak bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa
            mengakses object tersebut menggunakan static method getRuntime() milik class Runtime
 */

public class RuntimeApp {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Free Memory: " + runtime.freeMemory());
        System.out.println("Available Processors: " + runtime.availableProcessors());
        System.out.println(runtime.exec(new String[]{"notepad"}));
        runtime.gc();
    }
}
