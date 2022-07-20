

   import java.util.Scanner;
    public class Main {

        public static void main(String args[]) {
            int x, y, z;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the 3 sides of the triangle: ");
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();

            if ((x + y > z) && (y + z > x) && (z + x > y)){
            System.out.print("valid");}
            else {System.out.print("invalid");}
return;
        }
}
