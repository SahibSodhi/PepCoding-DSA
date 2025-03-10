package BasicsofDataStructures;
import java.util.Scanner;

public class ReverseofaNumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int reverse = 0;

        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }

        System.out.println(reverse);

        scanner.close();

    } 
}
