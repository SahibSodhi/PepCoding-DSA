package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            int val = 1; //nC0 = 1
            for(int j = 0; j <= i; j++){
                System.out.print(val + "\t");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }

        scanner.close();
    }
}
