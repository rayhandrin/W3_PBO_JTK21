package Soal7;

public class Soal7 {

    public static void main(String[] args) {
        // One Dimensional Arrays
        int[] fisrtArray = { 2, 5, 3 };
        int[] secondArray = { 9, 5, 3 };
        int[] thirdArray = { 2, 4, 9 };
        int[] fourthArray = { 10, 11, 12 };
        int[] fifthArray = { 13, 14, 15 };
        int[] sixthArray = { 16, 17, 18 };
        int[] seventhArray = { 19, 20, 21 };
        int[] eighthArray = { 22, 23, 24 };
        int[] ninthArray = { 25, 26, 27 };

        // Two Dimensional Arrays
        int[][] twoDimensionalArray1 = { fisrtArray, secondArray, thirdArray };
        int[][] twoDimensionalArray2 = { fourthArray, fifthArray, sixthArray };
        int[][] twoDimensionalArray3 = { seventhArray, eighthArray, ninthArray };

        // Three Dimensional Array
        int[][][] threeDimensionalArray = { twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3 };

        // Cara akses: threeDimentionalArray[][][]
        // int[0][0][0]
        // int[0][0][1]
        // int[0][0][2]

        // int[0][1][0]
        // int[0][1][1]
        // int[0][1][2]

        // int[0][2][0]
        // int[0][2][1]
        // int[0][2][2]

        // Iterasi untuk array luar ke-2
        for (int x = 0; x < 3; x++) {
            // Iterasi untuk array luar ke-2
            System.out.print("{");
            for (int y = 0; y < 3; y++) {
                System.out.print("{");
                // Iterasi untuk array luar ke-3
                for (int z = 0; z < 3; z++) {
                    System.out.print(threeDimensionalArray[x][y][z]);

                    // Cetak spasi pemisah
                    if (z < 2) {
                        System.out.print(" ");
                    }
                }
                System.out.print("}");

                // Cetak spasi pemisah
                if (y < 2) {
                    System.out.print(" ");
                }
            }
            System.out.println("}");
        }
    }
}
