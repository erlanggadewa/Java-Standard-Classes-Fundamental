package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


/*
    * Properties File
        - Kebanyakan aplikasi Java akan menyimpan konfigurasi file dalam bentuk properties file
        - Properties file adalah file yang berisi key value yang dipisahkan dengan tanda sama dengan (=)
        - Properties file bisa kita gunakan untuk menyimpan konfigurasi aplikasi kita
 */

public class PropertiesApp {
    public static void main(String[] args) {
//        * Contoh akses get data properties
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            System.out.println(properties.getProperty("database.port"));
            System.out.println(properties.getProperty("database.name"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        * Contoh akses create data properties
        try {
            Properties properties = new Properties();
            properties.put("name.first", "Erlangga");
            properties.put("name.middle", "Dewa");
            properties.put("name.last", "Sakti");
            properties.store(new FileOutputStream("name.properties"), "Konfigurasi nama");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
