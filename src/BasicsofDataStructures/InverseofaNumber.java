package BasicsofDataStructures;

import java.util.Scanner;

public class InverseofaNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int inverse = 0;
        int position = 1;

        while(n > 0){
            int digit = n % 10;
            inverse = inverse + position * (int)Math.pow(10, digit - 1);
            n = n/10;
            position++;
        }

        System.out.println(inverse);
        
        scanner.close();
    }

}
