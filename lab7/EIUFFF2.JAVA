import java.util.Scanner;

public class EIUFF2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = (double)sc.nextDouble()/100;
        double f = (double)sc.nextDouble()/100;
        int C = sc.nextInt();

        double tinh = C / (r - f);
        System.out.println((int)Math.ceil(tinh));
    }

    
}