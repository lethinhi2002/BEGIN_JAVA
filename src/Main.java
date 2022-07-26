//.Write a method called median that accepts an array of integers as its
//argument and returns the median of the numbers in the array. The median is
//the number that will appear in the middle if you arrange the elements in order.
//Assume that the array is of odd size (so that one sole element constitutes the
//median) and that the numbers in the array are between 0 and 99 inclusive.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" number of elements in the array= ");
        int n=input.nextInt();
        int[] a = new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.print("a["+(i)+"]= ");
            a[i]=input.nextInt();
        }
        Arrays.sort(a);
        System.out.println("median of the numbers in the array= "+a[(a.length)/2]);

    }
}

