/*
 * Question:-05: Sort the Array in Reverse order.
 */
package basicjavaproblems;

import java.util.Arrays;
import java.util.Scanner;


public class ReverseSortArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.print("Enter a number for array length: ");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
           arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Given Array: " + Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        System.out.println("Sort array (reverse order): " + Arrays.toString(arr));
        input.close();
    }   
}
