/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaproblems;

import java.util.Arrays;

/**
 *
 * @author Awerty
 */
public class UniqueRandom {
    public static void main(String[] args) {
        int arr[] = new int[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        System.out.println("Ten random numbers within 1-100: " + Arrays.toString(arr));
    }
}
