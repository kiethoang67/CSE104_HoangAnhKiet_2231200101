import java.util.Scanner;

public class EISNAIL {
    static Scanner sc = new Scanner(System.in);
    // public static void main(String[] args) {
    //     Long A = sc.nextLong();
    //     Long B = sc.nextLong();
    //     Long V = sc.nextLong();

    //     long disOfDay = A - B;
    //     long dis = V - A;
    //     long ngay = (long) Math.ceil((double)dis/disOfDay);
        
    //     System.err.println(ngay);
    // }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long V = sc.nextLong();
        

        long dis = V - A;
        long disOfDay = A - B;
        long distance = (long) Math.ceil((double)dis/disOfDay) + 1;
        System.out.println(distance);
    }
}
