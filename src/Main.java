//. Write a program that prompts the user for many integers and print the total
//even sum and maximum of the even numbers. You may assume that the user
//types at least one non-negative even integer.
//how many integers? 4
//next integer? 2
//next integer? 9
//next integer? 18
//next integer? 4
//even sum = 24
//even max = 18

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[1000];
        System.out.print("how many integers? ");
        int n = input.nextInt();
        int max = 0, total = 0;
        int m = 1;
        while (m <= n) {
            System.out.print("next integer? ");
            a[m] = input.nextInt();
            if (a[m] % 2 == 0) {
                total += a[m];
                if (a[m] > max) max = a[m];
            }
            m++;
        }
        System.out.println("even sum = "+total);
        System.out.println("even max = "+max);
    }
}
