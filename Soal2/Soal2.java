package Soal2;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanS = new Scanner(System.in);
        Scanner scanI = new Scanner(System.in);
        String[] sArr = new String[3];
        int[] iArr = new int[3];

        for (int x = 0; x < 3; x++) {
            sArr[x] = scanS.nextLine();
            iArr[x] = scanI.nextInt();
        }

        System.out.println();
        System.out.println("================================");
        for (int x = 0; x < 3; x++) {
            System.out.printf("%-15s", sArr[x]);
            System.out.printf("%0,3d%n", iArr[x]);
        }
        System.out.println("================================");
    }
}
