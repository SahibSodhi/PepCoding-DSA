package BasicsofDataStructures;

import java.util.Scanner;

public class DigitsofaNumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int countOfDigits = 0;

        while(temp > 0){
            temp = temp/10;
            countOfDigits++;
        }

        int div = (int)Math.pow(10, countOfDigits - 1);
        while(div > 0){
            int quotient = n/div;
            System.out.println(quotient);
            n = n % div;
            div = div/10;
        }

        scanner.close();
    }
}
