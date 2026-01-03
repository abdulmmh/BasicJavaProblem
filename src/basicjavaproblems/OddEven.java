/*
 * Question:-09: Find out the Odd-even number among n number of values.
 */
package basicjavaproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you wanna check? ");
        int n = input.nextInt();
        
        int arr[] = new int[n];  
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("Given numbers: " + Arrays.toString(arr));
        
//        System.out.print("Even numbers are : [");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                System.out.print(" " + arr[i]);
//            } 
//        }
//        System.out.print(" ] \n");
//        
//        System.out.print("Odd numbers are : [");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                System.out.print(" " + arr[i]);
//            } 
//        }
//        System.out.print(" ] \n");
        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        odd.sort(null);
//        Collections.sort(odd);
//        Collections.reverse(odd);
        
//        Collections.sort(odd, Collections.reverseOrder());
        System.out.println("Even numbers are: " + even);
        System.out.println("Odd numbers are: " + odd);
    }
}
