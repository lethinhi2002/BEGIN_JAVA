
// Write a method named lastIndexOf that accepts an array of integers and
//an integer value as its parameters and returns the last index at which the
//value occurs in the array. The method should return -1 if the value is not
//found. For example, in the list containing {74, 85, 102, 99, 101, 85, 56}, the
//last index of the value 85 is 5.
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
        System.out.print("number= ");
        int number=input.nextInt();
        int lastIndexOf=-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==number) lastIndexOf=i;
        }
        System.out.println(lastIndexOf);
    }
}



