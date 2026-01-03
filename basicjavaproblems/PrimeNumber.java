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
public class PrimeNumber {
    static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
                if (num % i == 0){
                    return false;
                }
            }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        
        if (isPrime(number) == true) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is a non-prime number.");
        }
        
    }
}
