package com.practice;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;

/*
    * Big Number
        - Jika kita ada kebutuhan untuk menggunakan angka yang besar sehingga melebihi kapasitas Long
            dan Double, di Java sudah disediakan class untuk handle data besar tersebut
        - Biglnteger adalah class untuk handle tipe data Integer
        - BigDecimal adalah class untuk handle tipe data floating point
 */

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger int1 = new BigInteger("1000000000000000000000000000000000000000000000000001");
        BigInteger int2 = new BigInteger("1000000000000000000000000000000000000000000000000000");

        BigInteger sumResult = int1.add(int2);
        System.out.println(sumResult);


        BigInteger multiplyResult = int1.multiply(int2);
        System.out.println(multiplyResult);

        BigInteger divideResult = int1.divide(int2);
        System.out.println(divideResult);

        BigInteger remainderResult = int1.remainder(int2);
        System.out.println(remainderResult);

        BigInteger modResult = int1.mod(int2);
        System.out.println(modResult);

    }

    public static class DateApp {
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
}
