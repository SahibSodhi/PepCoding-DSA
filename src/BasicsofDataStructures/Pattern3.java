package BasicsofDataStructures;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i = 1; i <= n; i++){
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
