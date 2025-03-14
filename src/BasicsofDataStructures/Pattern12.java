package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int prev = 0;
        int curr = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(prev + "\t");
                int sum = prev + curr;
                prev = curr;
                curr = sum;
            }
            System.out.println();
        }

        scanner.close();
    }
}
