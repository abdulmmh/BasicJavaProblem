package basicjavaproblems;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Awerty
 */
public class ConditionalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int sentinalValue = 0;
       
        while (true) {   
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            sum += num;
            if (num == sentinalValue) {
                break;
            }
        }
        System.out.println("Sum until input 0(zero): " + sum);
    }
}
