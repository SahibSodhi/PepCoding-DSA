package BasicsofDataStructures;

import java.util.Scanner;

public class GCDandLCM {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int originaln1 = n1;
    int originaln2 = n2;

    while(n1 % n2 != 0){
        int rem = n1 % n2;
        n1 = n2;
        n2 = rem;
    }

    int gcd = n2;
    int lcm = (originaln1 * originaln2)/gcd;

    System.out.println("GCD: " + gcd);
    System.out.println("LCM: " + lcm);
    scanner.close();
}
}
