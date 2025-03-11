package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= mid) {
                    if (j >= mid - i && j <= mid + i) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    if (j >= i - mid && j < n - (i - mid)) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
