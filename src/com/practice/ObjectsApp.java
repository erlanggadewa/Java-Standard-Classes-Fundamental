package com.practice;

import java.util.Objects;

/*
    * Objects Class
        - Awas jangan tertukar, ini class Objects, bukan Object
        - Objects adalah class utility yang berisikan banyak static method yang bisa kita gunakan untuk
            operasi object atau melakukan pengecekan sebelum operasi nya dilakukan
        - Utility class ini memiliki mekanisme null safe, jadi kita tidak perlu melakukan pengecekan null
            secara manual
 */

public class ObjectsApp {
    public static void main(String[] args) {
        execute(null);
    }

    public static void execute(Data data) {
//        Tidak usah melakukan pengecekan null
        System.out.println(Objects.hashCode(data));

//        Wajib melakukan pengecekan null
        if (data != null)
            System.out.println(data.hashCode());
    }

    public static class Data {
        private String data;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data1 = (Data) o;
            return Objects.equals(data, data1.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
}
