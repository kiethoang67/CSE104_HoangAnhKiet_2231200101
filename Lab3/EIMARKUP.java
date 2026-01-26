import java.util.Scanner;

public class EIMARKUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long total = 0;
        int block = 0;

        while (N > 0) {
            long take = Math.min(100, N);

            int price = 200 - block;
            if (price < 180) {
                price = 180;
            }

            total += take * price;
            N -= take;
            block++;
        }

        System.out.println(total);
    }
}
