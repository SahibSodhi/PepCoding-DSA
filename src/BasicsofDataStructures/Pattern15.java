package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int spaces = n / 2;
        int stars = 1;
        int val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }

            int cval = val;
            for (int j = 1; j <= stars; j++) {
                System.out.print(cval + " \t");
                if (j <= stars / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }

            if (i <= n / 2) {
                spaces--;
                stars += 2;
                val++;
            } else {
                spaces++;
                stars -= 2;
                val--;
            }

            System.out.println();
        }

        scanner.close();
    }
}
