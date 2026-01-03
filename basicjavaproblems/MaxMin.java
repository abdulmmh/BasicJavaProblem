/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaproblems;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Awerty
 */
public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you wanna check? ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {            
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Given numbers: " + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i] ) {
                max = arr[i];
            } else if ( min > arr[i]){
                    
                    min = arr[i];
            }
        }
        System.out.println("Maximum number : " + max);
        System.out.println("Minimum number : " + min);
    }
}
