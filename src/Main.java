

import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What color do you want? ");
        String color = scanner.next();
        if(color.equalsIgnoreCase("R")) {
            System.out.println("You have chosen Red.");
        } else if(color.equalsIgnoreCase("B")) {
            System.out.println("You have chosen Blue.");
        } else if(color.equalsIgnoreCase("G")) {
            System.out.println("You have chosen Green.");
        } else {
            System.out.println("Unknown color: " + color);
        }

        }
    }





