package BasicsofDataStructures;

import java.util.Scanner;

public class CountDigitsinaNumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countOfDigits = 0;

        while(n > 0){
            n = n/10;
            countOfDigits++;
        }

        System.out.println(countOfDigits);
        scanner.close();
    }

}
