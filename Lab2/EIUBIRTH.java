import java.util.Scanner;

public class EIUBIRTH {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        for (int i = 0; i < test ; i++){
            long B = sc.nextLong();
            long R = sc.nextLong();
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long Z = sc.nextLong();
            long costBlue = 0;
            long costRed = 0;
            costBlue += Math.min(X, Y + Z);
            costRed += Math.min(Y, X + Z);
            long total = B * costBlue + R * costRed;
            System.out.println(total);
        }
        
    }
}
