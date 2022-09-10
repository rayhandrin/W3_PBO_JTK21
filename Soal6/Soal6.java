package Soal6;

import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        BigInteger BI_1 = new BigInteger("0");
        BigInteger BI_2 = new BigInteger("0");
        Scanner scanThis = new Scanner(System.in);
        BI_1 = scanThis.nextBigInteger();
        BI_2 = scanThis.nextBigInteger();

        System.out.println(BI_1.add(BI_2));
        System.out.println(BI_1.multiply(BI_2));
    }
}
