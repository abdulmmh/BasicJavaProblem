/*
 * Question:-07: Find out the ten unique Random Numbers.
 */
package basicjavaproblems;

import java.util.Arrays;

public class UniqueRandom {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int index = 0;

        while (index < arr.length) {
            int num = 1 + (int)(Math.random() * 100); // 1-100
            boolean exists = false;

          
            for (int i = 0; i < index; i++) {
                if (arr[i] == num) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                arr[index++] = num; 
            }
        }

        System.out.println("Ten unique random numbers (1-100): " + Arrays.toString(arr));
    }
}
