import java.util.Scanner;

public class MADIS2 {
    static Scanner sc = new Scanner(System.in);
    static long maxDiff = 0;
    static long minValue = 0;

    public static void main(String[] args) {
        int n = sc.nextInt();
        Long[] arr = new Long[n];
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextLong();
        }
        minValue = arr[0];
        for (int i = 0; i < n; i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
            long currentDiff = arr[i] - minValue;
            if(maxDiff < currentDiff){
                    maxDiff = currentDiff;
                }
        }
        System.out.println(maxDiff);
    }
}
