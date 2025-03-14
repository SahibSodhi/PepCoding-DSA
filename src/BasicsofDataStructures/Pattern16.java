package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int stars = 1;
        int spaces = 2 * n - 3;

        for (int i = 1; i <= n; i++) {
            int val = 1;
            for (int j = 1; j <= stars; j++) {
                System.out.print(val + "\t");
                val++;
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            if( i == n) {
                stars--;
                val--;
            }

            for (int j = 1; j <= stars; j++) {
                val--;
                System.out.print(val + "\t");
            }

            stars++;
            spaces -= 2;
            System.out.println();
        }

        scanner.close();
    }
}
