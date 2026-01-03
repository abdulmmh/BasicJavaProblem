/*
 * Question:-10: Calculate the number with Power.
 */
package basicjavaproblems;

import java.util.Scanner;


public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for base: ");
        int a = input.nextInt();
        
        System.out.print("Enter a number for power: ");
        int n = input.nextInt();
        
//        long result =(long) Math.pow(a, n);
        long result = 1;
         for (int i = 0; i < n; i++) {
            result *= a;
        }
        
        System.out.println("Result = " + result);
        input.close();
    }
}
