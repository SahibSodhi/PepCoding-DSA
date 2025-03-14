package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int spaces = n/2;
        int stars = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= spaces; j++){
                if(i == n/2 + 1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }

            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }

            if(i <= n/2){
                stars++;
            }
            else{
                stars--;
            }

            System.out.println();
        }

        scanner.close();
    }
}
