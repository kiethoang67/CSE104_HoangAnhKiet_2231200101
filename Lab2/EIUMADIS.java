import java.util.Scanner;

public class EIUMADIS {
    static Scanner sc = new Scanner(System.in);
    static long max = 0;

    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                long diff = arr[j] - arr[i];
                if (diff > max) {
                    max = diff;
                }
            }
        }

        System.out.println(max);
    }
}
