/* Question:-03: Find out the Prime number. */
package basicjavaproblems;

import java.util.Scanner;


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
        input.close();
    }
}
