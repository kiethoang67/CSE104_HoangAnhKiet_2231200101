import java.util.Scanner;

public class EIUPURCHASE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long P = sc.nextLong(); //tien goc
        long M = sc.nextLong(); //tien tra truoc
        int N = sc.nextInt(); //thang 
        double R = sc.nextDouble(); //lai

        double tinh = (P - M) * (R/(1 - Math.pow(1 + R, -N)));
        System.out.println((long) tinh);
    }
    
}