package BasicsofDataStructures;

import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int div = 2; div * div <= n; div++){
            while(n % div == 0){
                n = n/div;
                System.out.println(div);
            }
        }

        if(n != 1){//edge case for eg. n = 46
            System.out.println(n);
        }

        scanner.close();
    }
}
