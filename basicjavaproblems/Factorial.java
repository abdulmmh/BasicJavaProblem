/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaproblems;

import java.util.Scanner;

/**
 *
 * @author Awerty
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check its factorial: ");
        int n = input.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            
            factorial *= i;
            
        }
        System.out.println("Factorial of " + n + " is " + factorial + ".");
    }
}
