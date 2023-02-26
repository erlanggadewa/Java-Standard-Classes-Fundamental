package com.practice;

import java.util.Calendar;
import java.util.Date;

/*
    * Date & Calendar
        - Tiap bahasa pemrograman biasanya memiliki representasi tanggal, di Java juga sama, ada class
        - Date & Calendar yang bisa kita gunakan sebagai representasi tanggal
        - Sebenarnya di Java 8 sudah ada cara manipulasi tanggal yang baru menggunakan Java Date Time API,
            Sekarang kita akan fokus menggunakan class Date dan Calendar

    * Hubungan Date dan Calendar
        - Class Date adalah class representasi tanggal sampai presisi milisecond
        - Namun di class Date sudah banyak method-method yang di @deprecated, sehingga untuk
            memanipulasi date tanggal, kita sekarang harus melakukan kombinasi antara class Date dan Calendar
        - Sederhananya Date untuk representasi tanggal, dan Calendar untuk memanipulasi tanggal
 */

public class DateApp {
    public static void main(String[] args) {
//        Method set akan menset waktu yang kita inginkan
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.YEAR, 2023);
        calendar1.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar1.set(Calendar.HOUR_OF_DAY, 12);

        Date result1 = calendar1.getTime();
        System.out.println(result1);


//        Method add akan menambahkan/mengurangi waktu sebanyak yang kita inginkan
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.YEAR, -10);
        calendar2.add(Calendar.MONTH, 5);
        calendar2.add(Calendar.HOUR_OF_DAY, 5);
        Date result2 = calendar2.getTime();
        System.out.println(result2);
    }
}
