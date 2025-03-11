package BasicsofDataStructures;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // if(a > b && a > c){
        //     if(a * a == b * b + c * c){
        //         System.out.println("true");
        //     }else{
        //         System.out.println("false");
        //     }
        // }else if(b > a && b > c){
        //     if(b * b == a * a + c * c){
        //         System.out.println("true");
        //     }else{
        //         System.out.println("false");
        //     }
        // }else{
        //     if(c * c == a * a + b * b){
        //         System.out.println("true");
        //     }else{
        //         System.out.println("false");
        //     }
        // }

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        if(max == a){
            boolean flag  = (a * a == b * b + c * c);
            System.out.println(flag);
        }else if(max == b){
            boolean flag  = (b * b == a * a + c * c);
            System.out.println(flag);
        }else{  //max == c
            boolean flag  = (c * c == a * a + b * b);
            System.out.println(flag);
        }

        scanner.close();
    }
}
