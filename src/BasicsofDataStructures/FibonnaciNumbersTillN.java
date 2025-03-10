package BasicsofDataStructures;

import java.util.Scanner;

public class FibonnaciNumbersTillN {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int prev = 0;
        int curr = 1;

        for(int i = 0; i  < n; i++){
            System.out.println(prev);
            int temp = prev + curr;
            prev = curr;
            curr = temp;
        }

        scanner.close();
    }
}
