//7. Write a program that asks the user to enter numbers, then prints the smallest
//and largest of all the numbers typed in by the user. You may assume the user
//enters a valid number greater than 0 for the number of numbers to read. Here
//is an example dialogue:
//How many numbers do you want to enter? 4
//Number 1: 5
//Number 2: 11
//Number 3: -2
//Number 4: 3
//Smallest = -2
//Largest = 11
//8. Write a program t

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[1000];
        System.out.print("How many numbers do you want to enter: ");
        int n = input.nextInt();
        int max = -999999, min = 999999;
        int m = 1;
        while (m <= n) {
            System.out.print("Number "+m+" :");
            int tempo = input.nextInt();
            min=Math.min(min,tempo);
            max=Math.max(max,tempo);
            m++;
        }
        System.out.println("Smallest "+min);
        System.out.println("Largest = "+max);
    }
}
