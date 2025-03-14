package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int mid = n/2;
        int stars = mid + 1;
        int spaces = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= stars; j++){
                System.out.print("*\t");
            }
            
            if(i <= mid){
                stars--;
                spaces += 2;
            }
            else{
                stars++;
                spaces -= 2;
            }

            System.out.println();
        }

        scanner.close();
    }
}
