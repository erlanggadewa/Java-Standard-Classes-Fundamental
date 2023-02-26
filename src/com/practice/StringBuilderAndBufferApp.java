package com.practice;

/*
    * Immutable String
        - String adalah tipe data immutable, artinya tidak bisa berubah isinya, saat kita mengubah string,
        - sebenarnya yang dilakukan di Java adalah membuat String baru.
        - Jika kita ingin memanipulasi String dalam jumlah banyak, sangat tidak disarankan menggunakan
            String, karena akan memakan memory yang cukup besar, untuk kasus seperti ini, disarankan
            menggunakan StringBuffer atau StringBuilder

    * StringBuffer vs StringBuilder
        - Kemampuan StringBuffer dan StringBuilder cukup sama, bisa digunakan untuk memanipulasi String
        - Yang membedakan adalah, StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe
        - Jika kita ingin memanipulasi String secara paralel bersamaan, disarankan menggunakan
            StringBuffer, namun jika tidak butuh paralel, cukup gunakan StringBuilder
        - Karena StringBuffer dibuat agar thread safe, maka secara otomatis performanya lebih lambat
            dibandingkan StringBuilder
 */

public class StringBuilderAndBufferApp {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Erlangga");
        System.out.println("Alamat name sebelum dimodifikasi " + name.hashCode());
        name.append(" Dewa Sakti");
        System.out.println("Alamat name sesudah dimodifikasi " + name.hashCode());
        System.out.println(name);

        StringBuffer name2 = new StringBuffer("Carissa");
        System.out.println("Alamat name2 sebelum dimodifikasi " + name2.hashCode());
        name2.append(" Indah Swastika");
        System.out.println("Alamat name2 sesudah dimodifikasi " + name2.hashCode());
        System.out.println(name2);

    }
}











