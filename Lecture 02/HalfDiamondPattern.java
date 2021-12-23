package Lecture;

public class HalfDiamondPattern {
    
    public static void printPattern(int N) {

        System.out.println("Printing Half Diamond of size: " + N);

        for (int i = 1; i <= N; i++) {
            // Print Spaces
            for (int j = N - i; j > 0; j--) {
                System.out.print(' ');
            }

            // Print Stars
            for (int k = 2*i-1; k > 0; k--) {
                System.out.print('*');
            }

            System.out.println("");
        }

    }
}
