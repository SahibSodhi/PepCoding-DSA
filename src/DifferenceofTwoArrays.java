import java.util.Scanner;

public class DifferenceofTwoArrays {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        for(int i = 0; i < n; i++){
            arr1[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] arr2 = new int[m];

        for(int i = 0; i < m; i++){
            arr2[i] = scanner.nextInt();
        }

        //Array 2 will be bigger or atleast of the size of Array 1
        int[] diff = new int[m];
        int carry = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while(k >= 0){
            int arr1val  = i >= 0 ? arr1[i] : 0; // Edge case for handling if arr1 has digit but arr2 doesn't. Eg: 1000 - 1

            if(arr2[j] + carry >= arr1val){
                diff[k] = arr2[j] + carry - arr1val;
                carry = 0;
            }
            else {
                diff[k] = arr2[j] + carry + 10 - arr1val;
                carry = -1;
            }

            i--;
            j--;
            k--;
        }

        //Edge case for removing preceeding/leading zeroes
        int idx = 0;
        while(idx < diff.length){
            if(diff[idx] == 0){
                idx++;
            }
            else {
                break;
            }
        }

        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }

        scanner.close();

    }
}
