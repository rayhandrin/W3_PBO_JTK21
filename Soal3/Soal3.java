package Soal3;

import java.util.Scanner;
import java.lang.Math;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanThis = new Scanner(System.in);
        String s = scanThis.nextLine();
        String[] arr = s.split(" ", 3);
        long[] i = new long[2];

        i[0] = Long.parseLong(arr[0]);
        i[1] = Long.parseLong(arr[2]);

        switch (arr[1]) {
            case "+":
                System.out.println(i[0] + i[1]);
                break;
            case "-":
                System.out.println(i[0] - i[1]);
                break;
            case "*":
                System.out.println(i[0] * i[1]);
                break;
            case "/":
                System.out.println(Math.round(i[0] / i[1]));
                break;
            default:
                System.out.println("Operator tidak dikenali");
                break;
        }
    }
}
