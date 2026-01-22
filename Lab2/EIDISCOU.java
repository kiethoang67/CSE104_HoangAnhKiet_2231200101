import java.util.Scanner;

public class EIDISCOU {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n = sc.nextLong();
        long totalDiscount = 0;
        long[] money = {2_000_000, 10_000_000,50_000_000,100_000_000,200_000_000,500_000_000,Long.MAX_VALUE};
        double[] discountRate = {0.03, 0.05, 0.07, 0.1, 0.12, 0.15};
        for (int i = 0; i < discountRate.length;i++ ){
            if (n > money[i]){
                if(n > money[i+1]){
                    totalDiscount += (money[i+1]-money[i])*discountRate[i];
                }else{
                    totalDiscount += (n-money[i])*discountRate[i];
                }
            }
        }
        System.out.println((long)n-totalDiscount);
    }
}
