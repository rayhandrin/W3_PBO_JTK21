package Soal5;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanThis = new Scanner(System.in);
        String s = scanThis.nextLine();
        String[] arr = s.split(" ", 4);
        long[] i = new long[4];
        int x = 0;
        long res = 0;

        for (String a : arr) {
            i[x] = Long.parseLong(a);
            res += i[x];
            x += 1;
        }

        /* 
         * Saya bingung harus digabungkan atau dijumlahkan mengingat
         * output yang diberikan akan berbeda apabila dijumlahkan.
         * Apabila saya menggabungkan, maka outputnya akan sama dengan
         * Soal4.java, tetapi apabila saya menjumlahkan, maka outputnya
         * akan dengan soal. Namun, saya harus mengubahnya menjadi
         * BigInteger.
         */
        if ((res - 999999) / 5 == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }
    }
}