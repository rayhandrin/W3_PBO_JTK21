package Soal1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanThis = new Scanner(System.in);
        String input = scanThis.nextLine();

        // Split the input into an array of strings
        String[] splited = input.split("[ !,?._'@]+");

        // Print the number of tokens.
        System.out.println(splited.length);

        // Print each token.
        for (String a : splited) {
            System.out.println(a);
        }
    }
}
