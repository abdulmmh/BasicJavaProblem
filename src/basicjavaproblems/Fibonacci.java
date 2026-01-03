/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Awerty
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers do you wanna check: ");
        int n = input.nextInt();
        
        int[] arr = new int[n]; 
        arr[0] = 0;
        arr[1] = 1;
        System.out.print("Fibonacci series: [" + arr[0] + ", "
                        + arr[1]);
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.print( ", " + arr[i]);
        }
        System.out.print("] \n");
        
    }
}
