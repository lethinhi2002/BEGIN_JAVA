

import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        int n, i;
        int marks[] = new int[12];
        float total = 0, avg;
        //n là số môn học cần tính
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects to be counted: ");
        n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("Enter the grade of the subject" + (i + 1) + ":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        avg = total / n;
        System.out.println("AVG " + n + " subject: " + avg);
        System.out.print(" Rank student: ");
        if (avg < 5) {
            System.out.print("bad");
        } else if (avg >= 5 && avg < 7) {
            System.out.print("Average");
        } else if (avg >= 7 && avg < 8) {
            System.out.print("good");
        } else if (avg >= 8 && avg < 9) {
            System.out.print("very good");
        }
           else  if (avg>=9){ System.out.print("excellent ");
           }

    }}





