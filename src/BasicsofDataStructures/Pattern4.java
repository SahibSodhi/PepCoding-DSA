package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n; j++){
                if(i + j > n){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
