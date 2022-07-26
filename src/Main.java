

//Write a program to read an integer number (n>0). Write flowing methods:
//- Checking whether the input number is a prime number or not?
//- Print out prime submultiples of number n
//- Generate the first 100 prime numbers.
    import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] a = new int[1000];
            System.out.print("n: ");
            int n = input.nextInt();
            System.out.println(n+(isPrime(n)?" is":" is not")+" a prime number");
            System.out.print("Prime submultiples of "+n+": ");
            for (int i = 1; i <=n ; i++) {
                if (n%i==0) if (isPrime(i)) System.out.print(i+" ");
            }
            System.out.println();
            for (int i=1;i<=100;i++) {
                if (isPrime(i)) System.out.print(i + " ");
            }

        }
        public static boolean isPrime(int n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            if (n==1) return false;
            return true;
        }
    }





















