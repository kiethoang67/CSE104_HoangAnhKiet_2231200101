package Lab5;
import java.util.Scanner;

public class EIINTEREST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rates = sc.nextDouble();
        double balance = 0;
        for (int i  = 0; i < 12; i++){
            int money = sc.nextInt();
            balance += money;
            balance = balance * (1 + rates);
        }
        System.out.println(Math.round(balance));
    }
}
