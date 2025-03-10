package BasicsofDataStructures;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int n = scanner.nextInt();
            boolean isPrime = true;

            if (n == 0 || n == 1) {
                System.out.println(n + " is not a prime number");
            }

            else {
                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        System.out.println(n + " is not a prime number");
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(n + " is a prime number");
                }
            }

        }

        scanner.close();
    }

}
