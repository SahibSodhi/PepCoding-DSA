package BasicsofDataStructures;

import java.util.Scanner;

public class RotateaNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int temp = n;
        int countOfDigits = 0;

        while(temp > 0){
            temp = temp/10;
            countOfDigits++;
        }

        k = k % countOfDigits; // if k is greater than the number of digits
        if(k < 0){// if k is negative
            k = k + countOfDigits;
        }

        int div = (int)Math.pow(10, k);

        int quotient = n/div;
        int remainder = n % div;

        int multiplier = (int)Math.pow(10, countOfDigits - k);
        int rotatedNumber = remainder * multiplier + quotient;

        System.out.println(rotatedNumber);

        scanner.close();
        
    }
}
