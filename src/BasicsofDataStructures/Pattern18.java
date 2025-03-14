package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int stars = n;
        int spaces = 0;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= stars; j++){
                if(i > 1 && i <= n/2 && j > 1 && j < stars){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }

            if(i <= n/2){
                stars -= 2;
                spaces++;
            }
            else{
                stars += 2;
                spaces--;
            }
            System.out.println();
        }

        scanner.close();
    }
}
