package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int outerSpaces = n / 2;
        int innerSpaces = -1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= outerSpaces; j++){
                System.out.print("\t");
            }
                System.out.print("*\t");
            for(int j = 1; j <= innerSpaces; j++){
                System.out.print("\t");
            }

            if (i > 1 && i < n) {
                System.out.print("*\t");
            }

            if (i <= n/2) {
                outerSpaces--;
                innerSpaces += 2;
            } else {
                outerSpaces++;
                innerSpaces -= 2;
            }

            System.out.println();
        }

        scanner.close();
    }
}
