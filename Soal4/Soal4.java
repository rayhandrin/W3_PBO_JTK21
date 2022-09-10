package Soal4;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanThis = new Scanner(System.in);
        var input = scanThis.nextInt();

        if (input > 80) {
            System.out.println(500000 + ((input * 50000) * 0.35));
        } else if (input >= 40) {
            System.out.println(500000 + ((input * 50000) * 0.25));
        } else if (input < 40) {
            System.out.println(500000 + ((input * 50000) * 0.1));
        } else if ((input >= 0) && (input <= 14)) {
            System.out.println(500000 - ((15 - input) * 50000 * 0.15));
        }
    }
}
