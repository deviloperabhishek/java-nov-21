package Lecture;

public class FullDiamondPattern {
    public static void printPattern(int N) {

        System.out.println("Printing Full Diamond of size: " + N);

        // increasing Diamond
        for (int i = 1; i <= N; i++) {
            // Print Spaces
            for (int j = N - i; j > 0; j--) {
                System.out.print(' ');
            }

            // Print Stars
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print('*');
            }

            System.out.println("");

        }

        // Decreasing Diamond
        int n = N - 1;
        int val = 2*n-1;
        for (int i = 1; i <= n; i++) {
            
            // Print Spaces
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }

            // Print Stars
            for (int k = val; k > 0; k--) {
                System.out.print('*');
            }
            val = val - 2;

            System.out.println("");
        }
    }
}
