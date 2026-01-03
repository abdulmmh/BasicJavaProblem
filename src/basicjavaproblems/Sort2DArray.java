/*
 *Question:-04: Sort the Multidimensional Array.
 */
package basicjavaproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sort2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for array length: ");
        int n = input.nextInt();
        
        int[][] arr = new int[n][n];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }
        System.out.println("Given 2D array: " + Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            arraySort(arr[i]);
        }
        
        System.out.println("Sorted 2D array(ascending) : " + Arrays.deepToString(arr));
        input.close();
    }
    
    static void arraySort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
    }
}
