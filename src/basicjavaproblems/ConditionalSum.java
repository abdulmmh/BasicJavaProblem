
/* Question:-08: Find out the Conditional Sum until input 0(zero).  */

package basicjavaproblems;

import java.util.Scanner;


public class ConditionalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int sentinelValue = 0;

       
        while (true) {   
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            
            if (num == sentinelValue) {
                break;
            }
            
            sum += num;
        }
        System.out.println("Sum until input 0(zero): " + sum);
    }
}
