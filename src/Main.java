import java.util.Scanner;
public class Main {
        public static void main(String args[]) {
            int x, y,tong,hieu,nhan,chia,phan_tram;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter two numbers : ");
            x = scanner.nextInt();
            y = scanner.nextInt();
            tong = x + y;
            hieu = x - y;
            nhan = x * y;
            chia = x / y;
            phan_tram = x%y;
            System.out.println("Tong = " +tong);
            System.out.println("Hieu = "+hieu);
            System.out.println("Nhan = "+nhan);
            System.out.println("Chia = "+chia);
            System.out.println("Phan tram = "+phan_tram);
        }
    }

